package Car;

public class MotorVehicle extends Vehicle {
	private int sizeOfEngine;
	private String licPlate;
	
	
	public void setSizeOfEngine(int s)
	{
		sizeOfEngine = s;
	}

	public int getSizeOfEngine()
	{
		return sizeOfEngine;
	}
	
	public void setLicPlate(String l)
	{
		licPlate = l;
	}

	public String getLicPlate()
	{
		return licPlate;
	}
}
