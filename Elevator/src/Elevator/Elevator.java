import java.io.IOException;

/**
 * 
 * Class elevator
 *
 */
public class Elevator {

	private final int MAX_FLOOR;
	private final int CAPACITY;
	private final int UP;
	private final int DOWN;
	
	private char[][] structure;
	private int currentFloor;				// current floor of elevator
	private int currentPassengers;			// current passenger inside elevator
	private boolean direction;				// direction 1 up, 0 down
	private boolean[] buttons;					// button inside cabine of elevator
	private boolean[][] floorButtons;		// this is the up and down buttons outside of elevator
	private int[] numOfLeavingPassengers;			// number of passenger will go out when the elevator reach target	sum of this array is the currentpassengers

	// constructor
	public Elevator() {
		this(4, 16); // default 4 floor 16 passengerS
	}

	public Elevator(int max, int cap) {
		this.MAX_FLOOR = max;
		this.CAPACITY = cap;
		this.UP= 1;
		this.DOWN =0;
		
		this.currentPassengers =0;
		this.currentFloor =1;
		this.direction=true;// go up as default
		this.buttons = new boolean[max];
		this.floorButtons = new boolean [this.MAX_FLOOR][2];  // up and down for every floors
		this.numOfLeavingPassengers = new int[max];				
		// 
		this.initStructure();
		//
	}
	
	public boolean getDirection(){ return direction;}
	public int getCurrentLevel(){ return currentFloor;}
	///-----------------------------------------------------------------------------------------------------------------
	// this section below functions use for initiating outside of this class
	///-----------------------------------------------------------------------------------------------------------------
	
	/** function for initiating
	 * This is the function for update the status of Elevator when
	 * Outsite buttons press, it will be affected are  floorButtons
	 */
	public void goUp(int fromfloor) {
		if(fromfloor >0 && fromfloor <= MAX_FLOOR)
			this.floorButtons[fromfloor-1][UP]= true;
	}
	
	/**function for initiating
	 * This is the function for update the status of Elevator when
	 * Outsite buttons press, it will be affected are  floorButtons
	 */
	public void goDown(int fromfloor) {
		if(fromfloor >0 && fromfloor <= MAX_FLOOR)
			this.floorButtons[fromfloor-1][DOWN]= true;
	}
	
	/**function for initiating
	 * This is the function for update the status of Elevator when
	 * inside buttons press, it will be affected are buttons[]
	 */
	public void stopAt(int floor) {
		if(floor >0 && floor <= MAX_FLOOR)
			this.buttons[floor-1]= true;
	}
	
	
	/* function for initiating
	 * register the numbet of passengers will go out at specific target level
	 * @param passenger
	 * @param targetLevel
	 */
	public void movePassenger(int passenger, int targetLevel)
	{
		if(targetLevel >0 && targetLevel <= MAX_FLOOR)
			this.numOfLeavingPassengers[targetLevel-1] +=passenger;
	}


	/** function for initiating
	 * add multiple passenger go in to elevator
	 */
	public void addPassengers(int increasePassengers)
	{
		int i = increasePassengers;
		while(i>0)
		{
			this.getOn();
			i--;
		}
	}
	
	///-----------------------------------------------------------------------------------------------------------------
	// this section below functions use for simulate controller
	///-----------------------------------------------------------------------------------------------------------------
	/* add a passenger to elevator
	  * @return
	  */
	private int getOn() {
		int rs=0;
		this.currentPassengers = this.currentPassengers >= this.CAPACITY ? this.CAPACITY : this.currentPassengers+1;
		rs = currentPassengers;
		return rs;
	}
		
	/**
	 * one passenger left
	 * @return
	 */
	private int getOff() {
		int rs =0;
		this.currentPassengers = this.currentPassengers <= 0 ? 0 : this.currentPassengers-1;
		rs = currentPassengers;
		
		// move out the passenger in array numOfLeavingPassenger
		numOfLeavingPassengers[currentFloor-1] = numOfLeavingPassengers[currentFloor-1] - 1;
		return rs;
	}


	// passenger will leave the cabine == OPEN THE DOOR
	private void leftPassengers(int leftPassengers)
	{
		int remain = currentPassengers - leftPassengers;
		while(remain>=0 && remain<currentPassengers)
		{
			this.getOff();
		}
		//
	}
	

	/**
	 * this is the main logic function of elevator, in reality it is the controller which control the elevator go up, down, stop open the door, close the down,
	 * check status for change direction of elevator.
	 * this function will be called every step
	 */
	public void simulateController()
	{
		//1.Check do the elevator have to OPEN the door at this level
		boolean upPushedButton = direction==true && ( floorButtons[currentFloor-1][UP]==true);
		boolean downPushedButton = direction==false && ( floorButtons[currentFloor-1][DOWN]==true);
		boolean reachTargetLevel  = buttons[currentFloor-1];
		boolean passengersOut  = numOfLeavingPassengers[currentFloor-1] > 0 ? true: false;
		
		if(reachTargetLevel || upPushedButton || downPushedButton || passengersOut )		
		{
			// open the door now == PASSENGER GO IN AND OUT
			// System.out.println("OPEN THE DOOR");
			// if there is any passenger reach this level let them out
			if(passengersOut)
			{
				//let people who reach this level go out
				leftPassengers(numOfLeavingPassengers[currentFloor-1] );
			}
			// clean the status of floorbuttons
			if(direction == true) floorButtons[currentFloor-1][UP] =false;
			if(direction == false) floorButtons[currentFloor-1][DOWN] =false;
			buttons[currentFloor-1] =false; // set current floor is handled
			//close the door now
			// System.out.println("CLOSE THE DOOR");
		}
		/// Draw structure here for update the current passenger
		drawStructure();
		
		//2. ok moving follow direction now
		// is there any button pushed both inside ans outside cabine
		upPushedButton = isAnyUPButtonPushed();
		downPushedButton = isAnyDOWNButtonPushed();
		// should i go up
		boolean isGoUp = (direction== true && upPushedButton == true) || (direction==false && upPushedButton==true && downPushedButton==false);
		boolean isGoDown = direction== false && downPushedButton == true || (direction==true && upPushedButton==false && downPushedButton==true);
		
		if(isGoUp)
		{
			direction = true; // set direction UP for case we reverse the direction
			// moving up now
			this.currentFloor= this.currentFloor>=this.MAX_FLOOR? this.MAX_FLOOR : this.currentFloor+1;
		}
		
		if(isGoDown)
		{
			direction =false;// set direction UP for case we reverse the direction
			//moving down now
			this.currentFloor= this.currentFloor==1? 1: this.currentFloor-1;
		}
	}
	
	
	/**
	 * check on both array, is there any up button is pushed which are above this current floor
	 * @return
	 */
	private boolean isAnyUPButtonPushed()
	{
		boolean rs =false;
		//check in buttons array
		for(int i = currentFloor; i< MAX_FLOOR;i++) 
		{
			if(buttons[i]==true) 
			{
				rs =true;
				break;
			}
		}
			
		// check in floorbutton array
		if(rs==false)
		{
			// check floorButtons array
			for(int i = currentFloor ; i< MAX_FLOOR;i++) 
			{
				if(floorButtons[i][UP]==true) 
				{
					rs =true;
					break;
				}
			}
		}
		return rs;
	}
	
	/**
	 * check on both array, is there any up button is pushed which are above this current floor
	 * @return
	 */
	private boolean isAnyDOWNButtonPushed()
	{
		boolean rs =false;
		//check in buttons array
		for(int i = currentFloor ; i>0;i--) 
		{
			if(buttons[i-1]==true) 
			{
				rs =true;
				break;
			}
		}
			
		// check in floorbutton array
		if(rs==false)
		{
			// check floorButtons array
			for(int i = currentFloor ; i>0;i--) 
			{
				if(floorButtons[i-1][DOWN]==true) 
				{
					rs =true;
					break;
				}
			}
		}
		return rs;
	}
	
	/**
	 * This section for drawing the framework the cabine on the screen	
	 */
	private void initStructure() {
		int cabinDimension = (int) (Math.sqrt(this.CAPACITY) + 2);  // lines
		int frameworkDimension = this.MAX_FLOOR*cabinDimension;		// columns
		//allocate structure object
		this.structure = new char[cabinDimension][frameworkDimension];
		
		// draw frame and borders
		this.drawFramework();
		// draw Empty space  in structure
		this.drawCabine(1, 0);    // draw zero passenger in first initialize structure
	}
	
	private void drawCabine(int floor, int passengers)
	{
		int cabinDimension = (int) (Math.sqrt(this.CAPACITY)+2);  // cabine withoud borders
		int frameworkDimension = this.MAX_FLOOR*cabinDimension;		// columns
		// draw Empty space  in structure
		int offsetCol = (floor-1)*cabinDimension;
		for(int i =1; i< cabinDimension-1; i++)	// lines
		{
			for(int j=1; j< cabinDimension-1; j++)	//columns
			{
				if(passengers>0){
					this.structure[i][j+offsetCol] = 'O';// draw O  for a passenger
					passengers--;
				}
				else this.structure[i][j+offsetCol] = 'E';				//draw E for empty space
			}
		}
	}

	private void drawFramework()
	{
		int cabinDimension = (int) (Math.sqrt(this.CAPACITY) + 2);  // lines
		int frameworkDimension = this.MAX_FLOOR*cabinDimension;		// columns
		
		for(int i =0; i< cabinDimension; i++)
		{
			int k =1;
			for(int j=0; j< frameworkDimension; j++)
			{
				/// draw border
				if(i==0 || i == cabinDimension-1 || j==0 || j==frameworkDimension-1) this.structure[i][j] = '#';
				else
					if(j == k*(cabinDimension)-1) 
					{
						this.structure[i][j] = '|';
						k++;// next stick line
					}
					else this.structure[i][j] = ' ';
			}
		}
	}
	
	public void drawStructure()
	{
		
		// draw frame and borders
		this.drawFramework();
		// draw Empty space  in structure
		this.drawCabine(this.currentFloor, this.currentPassengers);    // draw zero passenger in first initialize structure
		// print to console
		this.printStructure();
	}
	
	private void printStructure(){
		
		int cabinDimension = (int) (Math.sqrt(this.CAPACITY) + 2);  // lines
		for(int i =0; i< cabinDimension; i++)
		{
			System.out.print(this.structure[i]);  // print lines to console
			System.out.println("");// next line
		}
	}
}
