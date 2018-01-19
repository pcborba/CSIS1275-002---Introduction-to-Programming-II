package Car;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle();
		v1.setColour(253);
		v1.setSpeed(100);
		
		System.out.println("I have a vehicle ant its colour is  "+v1.getColour()+" and its speed is "+v1.getSpeed()+"\n");
			
		MotorVehicle m1 = new MotorVehicle();
		m1.setColour(255);
		m1.setSizeOfEngine(1);
		m1.setLicPlate("LIC1");
		
		System.out.println("I have a motorcycle with an engine which size is "+m1.getSizeOfEngine()+" and its lic plate is "+m1.getLicPlate()+" and its colour is "+m1.getColour()+"\n");
	
		Bicycle b1 = new Bicycle();
		b1.setColour(255);
		b1.ringBell();
		
		Car c1 = new Car();
		c1.colour = 234;
		c1.setNumOfDoors(4);
		System.out.println("I have a car with and its colour is "+c1.getColour()+"!");
		c1.switchOnAirCond();
		
	}
}
