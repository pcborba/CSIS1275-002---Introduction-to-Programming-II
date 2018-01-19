package Car;

public class Car extends Vehicle {
	public int numOfDoors;
	
	
	//Modifiers
	
	public void setNumOfDoors(int d)
	{
		numOfDoors = d;
	}
	
	public int getNumOfDoors()
	{
		return numOfDoors;
	}
	
	//Other methods
	
	public void switchOnAirCond()
	{
		System.out.println("Air condition is ont!");
	}
}
