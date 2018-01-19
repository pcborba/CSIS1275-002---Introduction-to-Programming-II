
public class Elevator {
	
	char[][] structure;
	final int CAPACITY;
	final int MAX_FLOOR;
	int currentFloor;
	
	public Elevator(int max, int cap){
		
		CAPACITY = cap;
		MAX_FLOOR = max;
		currentFloor = 0;
		
		int cabinDimension = (int) (Math.sqrt(CAPACITY) + 2);
		
		structure = new char[cabinDimension][MAX_FLOOR * cabinDimension];
		
		for(int i = 0; i < cabinDimension; i++){
			for(int j = 0; j < MAX_FLOOR * cabinDimension; j++){
				if(i == 0 || i == cabinDimension - 1 || j == 0 || j == MAX_FLOOR * cabinDimension - 1)
					structure[i][j] = '#';
				else if(j == cabinDimension - 1)
					structure[i][j] = '|';
				else
					structure[i][j] = ' ';
			}
		}
		
		for(int i = 1; i < cabinDimension - 1; i++)
			for(int j = 1; j < cabinDimension - 1; j++)
				structure[i][j] = 'E';			
		
	}
	
	public void goUp(){
		
		int cabinDimension = (int) (Math.sqrt(CAPACITY)) + 2;
		
		if(currentFloor != 0)
			for(int i = 1; i < cabinDimension - 1; structure[i][currentFloor * cabinDimension] = ' ', i++);
		
		currentFloor++;
		for(int i = 1; i < cabinDimension - 1; structure[i][currentFloor * cabinDimension - 1] = ' ', i++);
		
		for(int i = 1; i < cabinDimension - 1; structure[i][currentFloor * cabinDimension] = '|', i++);	
		if(currentFloor != MAX_FLOOR - 1)
			for(int i = 1; i < cabinDimension - 1; structure[i][(currentFloor + 1) * cabinDimension - 1] = '|', i++);
		
		movePassengers(currentFloor - 1, currentFloor);
		
	}
	
	public void goDown(){
		
		int cabinDimension = (int) (Math.sqrt(CAPACITY)) + 2;
		
		if(currentFloor != MAX_FLOOR - 1)
			for(int i = 1; i < cabinDimension - 1; structure[i][currentFloor * cabinDimension + cabinDimension - 1] = ' ', i++);
		
		for(int i = 1; i < cabinDimension - 1; structure[i][currentFloor * cabinDimension] = ' ', i++);
		
		for(int i = 1; i < cabinDimension - 1; structure[i][currentFloor * cabinDimension - 1] = '|', i++);
		
		currentFloor--;
		
		if(currentFloor != 0)
			for(int i = 1; i < cabinDimension - 1; structure[i][currentFloor * cabinDimension] = '|', i++);
		
		movePassengers(currentFloor + 1, currentFloor);
	}	
	
	private void movePassengers(int fromFloor, int toFloor){
		
		int cabinDimension = (int) (Math.sqrt(CAPACITY)) + 2;
		
		for(int i = 1; i < cabinDimension - 1; i++)
			for(int j = fromFloor * cabinDimension + 1, k = 1; j < fromFloor * cabinDimension + cabinDimension - 1; j++, k++){
				structure[i][toFloor * cabinDimension + k] = structure[i][j];
				structure[i][j] = ' ';
			}
		
	}
		
	public void printStructure(){
		
		int cabinDimension = (int) ((Math.sqrt(CAPACITY)) + 2);
		
		for(int i = 0; i < cabinDimension; i++){
			for(int j = 0; j < MAX_FLOOR * cabinDimension; j++)
				System.out.print(structure[i][j]);	
			System.out.println();
		}
		
	}
	
	
}
