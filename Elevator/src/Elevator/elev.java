import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/* Assignment 2 java 
* Group members:
* Yunjie Gao		Student ID : 300267900
* Ngoc Tuan Nguyen	Student ID : 300265666
* PAULO CESAR BORBA Student ID: 300268640
* 
* */
public class elev {
	
	Elevator objElevator;
	public elev()
	{
		this.objElevator=  new Elevator(8, 16);
	}

	public static void main(String[] args) throws Exception {
		Elevator objElevator1 = new Elevator(8, 16);	// 8 level
		Elevator objElevator2 = new Elevator();			// 4 level
		
		//-----------------------------------------------------
		elev objMain =new elev();
		objMain.testcase1(objElevator1, objElevator2);
	}		
	
	
	public void testcase1(Elevator objElevator1, Elevator objElevator2) throws Exception
	{
		boolean quit = false;		
		// Initial the values for the elevator to simulate
				//object elevator 1
				// 1. base floor =1 have outside push up button 
				objElevator1.goUp(1);
				// 2. 2 passenger go inside,, they will press button to target level 2
				objElevator1.addPassengers(2);
				objElevator1.stopAt(2);
				objElevator1.movePassenger(2, 2);
				
				// 3. level 3,5,7 have  outside push UP button  
				objElevator1.goUp(3);  // at this level 2 passenger will go in, they will press button to target level 4
				objElevator1.goUp(5);  // at this level 3 passenger will go in, they will press button to target level 8
				objElevator1.goUp(7);  // at this level 1 passenger will go in, they will press button to target level 8
				// 4. level 6 have  outside push DOWN button
				objElevator1.goDown(6);	// at this level 3 passenger will go in,, they will press button to target level 2
				//end the process the elevator have to stay at level 2
				//--------------------------------------------------------------------------------------------------------------------------
				
				//object elevator 2
				// 1. base floor =1 have outside push up button 
				objElevator2.goUp(1);
				// 2. 4 passenger go inside,, they will press button to target level 2
				objElevator2.addPassengers(7);
				objElevator2.stopAt(3);
				objElevator2.movePassenger(4, 3);
				objElevator2.stopAt(4);
				objElevator2.movePassenger(3, 4);
				
				// 3. level 3,5,7 have  outside push UP button  
				objElevator2.goDown(3);  // at this level 2 passenger will go in, they will press button to target level 4
				objElevator2.goDown(5);  // at this level 3 passenger will go in, they will press button to target level 8
			
				
				int counter = 1, targetlevel =-1,level=0, level2 =0;
				// simulate the elevators 
				while(!quit)
				{
					level = objElevator1.getCurrentLevel();
					 //System.out.println("LEVEL: " +level);
					switch (level)
					{
						case 3:// at this level 2 passenger will go in, they will press button to target level 4
							if(objElevator1.getDirection() ==true)
							{
								targetlevel =4;
								objElevator1.addPassengers(2);
								objElevator1.stopAt(targetlevel);
								objElevator1.movePassenger(2, targetlevel);
							}
						break;
						case 5:// at this level 3 passenger will go in, they will press button to target level 8
							if(objElevator1.getDirection() ==true)
							{
								targetlevel=8;
								objElevator1.addPassengers(3);
								objElevator1.stopAt(targetlevel);
								objElevator1.movePassenger(3, targetlevel);
							}
							break; 
						case 6: //GO DOWN: at this level 3 passenger will go in, they will press button to target level 2
							if(objElevator1.getDirection() ==false)
							{
								targetlevel=2; //GO DOWN
								objElevator1.addPassengers(3);
								objElevator1.stopAt(targetlevel);
								objElevator1.movePassenger(3, targetlevel);
							}
							break;
						case 7: // at this level 1 passenger will go in, they will press button to target level 8
							if(objElevator1.getDirection() ==true)
							{
								targetlevel =8;
								objElevator1.addPassengers(1);
								objElevator1.stopAt(targetlevel);
								objElevator1.movePassenger(1, targetlevel);
							}
							break;
					}
					// simulate the elevator 1
					objElevator1.simulateController();
					
					
					
					//simulate the elevator 2
					//objElevator2.simulate();
					//
					level2 = objElevator2.getCurrentLevel();
					switch (level2)
					{
						case 1:
							if(objElevator2.getDirection() ==false)
							{
								targetlevel=4;
								int passengers = 3;  // 3 passengers
								objElevator2.addPassengers(passengers);
								objElevator2.stopAt(targetlevel);
								objElevator2.movePassenger(passengers, targetlevel);
							}
						break;
						case 3:// at this level 2 passenger will go in, they will press button to target level 1
							if(objElevator2.getDirection() ==false)
							{
								targetlevel =1;
								objElevator2.addPassengers(2);
								objElevator2.stopAt(targetlevel);
								objElevator2.movePassenger(2, targetlevel);
							}
						break;
						case 5:// objElevator2 this level 3 passenger will go in, they will press button to target level 1
							if(objElevator2.getDirection() ==false)
							{
								targetlevel=1;
								objElevator2.addPassengers(3);
								objElevator2.stopAt(targetlevel);
								objElevator2.movePassenger(3, targetlevel);
							}
							break; 
						
					}
					// simulate the elevator 1
					objElevator2.simulateController();
					
					
					
					
					
					// sleep one second 
					Thread.sleep(1000);
					if(counter==20) break; else counter++;
				}
	}

}
