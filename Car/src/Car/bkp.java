package Car;

public class bkp { //USED TO STORE ALL THE METHODS AND ATTRIBUTES THAT I WROTE PREVIOUSLY

	
	private int speed, sizeOfEngine, colour, numOfDoors;
	private String licPlate;
	
	
	//Modifiers
	public void setSpeed(int v)
	{
		speed = v;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void setSizeOfEngine(int s)
	{
		sizeOfEngine = s;
	}

	public int getSizeOfEngine()
	{
		return sizeOfEngine;
	}

	public void setColour(int c)
	{
		colour = c;
	}
	
	public int getColour()
	{
		return colour;
	}
	
	public void setNumOfDoors(int d)
	{
		numOfDoors = d;
	}
	
	public int getNumOfDoors()
	{
		return numOfDoors;
	}
	
	public void setLicPlate(String l)
	{
		licPlate = l;
	}

	public String getLicPlate()
	{
		return licPlate;
	}
	
	
	//Other methods
	
	public void turnLeft()
	{
		System.out.println("Car is turnin left!");
	}
	
	public void turnRight()
	{
		System.out.println("Car is turnin right!");
	}
	
	public void switchOnAirCond()
	{
		System.out.println("Air condition is ont!");
	}
}
