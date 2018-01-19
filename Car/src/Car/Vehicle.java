package Car;

public class Vehicle {
	protected int speed, colour;

	//Modifiers
	public void setSpeed(int v)
	{
		speed = v;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void setColour(int c)
	{
		colour = c;
	}
	
	public int getColour()
	{
		return colour;
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
}
