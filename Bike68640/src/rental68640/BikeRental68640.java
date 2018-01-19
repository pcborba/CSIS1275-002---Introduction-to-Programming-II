//PAULO CESAR BORBA - Student ID 68640
package rental68640;
import javax.swing.JOptionPane;

public class BikeRental68640 {
	public static void main(String[] args) 
	{
		String custName = JOptionPane.showInputDialog("Please enter your name");//declaring a String object to hold customer name and assigning the content of user input to it
		float hrsRent = Float.parseFloat(JOptionPane.showInputDialog("How many hours do you want to rent?"));//declaring a float variable to hold qty of hours and parsing the user input to it from string to float
		String bikeType = JOptionPane.showInputDialog(null, "1: Moutain, 2:7-speed, 3:Tandem Bike", "Select a bike type");//declaring a String object to hold type of bike and assigning the content of user input to it
		int insurance = JOptionPane.showConfirmDialog(null, "Insurance needed?");//declaring a int variable to hold the user's option for contract a insurance or not and assigning the user input to it
		int gps = JOptionPane.showConfirmDialog(null, "Bike GPS needed?");//declaring a int variable to hold the user's option for contract a GPS or not and assigning the user input to it

		Rental68640 myRent = new Rental68640(custName, hrsRent,Integer.parseInt(bikeType), insurance, gps);//Instantiating a Rental68640 class to create a myRent object, and properly passing the arguments
		myRent.showResult(); //calling the method showResult from the object myRent
	}
}
