//PAULO CESAR BORBA - Student ID 68640
package rental68640;

public class Rental68640 {
	//Declaring the private variables and objects
	private String _custName, _bikeDesc, _insDesc, _gpsDesc; //declaring String objects to hold descriptions as customer name and bike description
	private float _hours, _subTotal, _taxAmt, _totalAmt ;//declaring int variables to receive the arguments passed from the main program when instantiating the class, as well to hold totals and taxes, 
	private int _bikeType, _insurance, _gps;//declaring int variable to receive the arguments passed during the instantiating process that constructor will receive as parameter
	private final float hourRateType1 = 10.5f; //declaring constant to hold values that are unchangeable 
	private final float hourRateType2 = 13f; //declaring constant to hold values that are unchangeable 
	private final float hourRateType3 = 15f;//declaring constant to hold values that are unchangeable 
	private final float insuranceRate = 3f;//declaring constant to hold values that are unchangeable 
	private final float gpsRate = 5f;//declaring constant to hold values that are unchangeable 
	private final float taxRate = 0.05f; //declaring constant to hold values that are unchangeable 
	
	public Rental68640(String name, float hours, int bikeType, int insurance, int gps)//Defining the header of the constructor and the required parameter
	{	//assigning the values from argument designated to parameters and initiating the ohter variables
		_custName = name;
		_hours = hours;
		_bikeType = bikeType;
		_insurance = insurance;
		_gps = gps;
		_subTotal = 0f;
		_taxAmt = 0f;
		_totalAmt = 0f;
	}
		
	public void showResult()
	{
		if(_bikeType == 1)//checking which type of bike user select to set the description and the rental cost for the hours
		{
			_bikeDesc = "Moutain bike";
			_subTotal += _hours*hourRateType1;
		}
		else if(_bikeType == 2)
		{
			_bikeDesc = "7-speed race bike";
			_subTotal += _hours*hourRateType2;
		}
		else
		{
			_bikeDesc = "Tandem Bike";
			_subTotal += _hours*hourRateType3;
		}
					
		if(_insurance==0)//checking if customer is contracting insurance to properly allocate the cost and the description 
		{
			_subTotal += insuranceRate;
			_insDesc = "Required";
		}
		else
		{
			_insDesc = "Not needed";
		}
		
		if(_gps==0)//checking if customer is contracting gps to properly allocate the cost and the description
		{
			_subTotal += gpsRate;
			_gpsDesc = "Required";
		}
		else
		{
			_gpsDesc = "Not needed";
		}
		
		_taxAmt = _subTotal*taxRate;//calculating the value to total tax
		_totalAmt = _subTotal + _taxAmt;//calculating the total amount
		
		System.out.printf("Hello %s, thanks for renting a %s for %.1f hour(s).\n", _custName, _bikeDesc, _hours);//using printf method to display the summary properly
		System.out.printf("Insurance: %s, GPS: %s.\n", _insDesc, _gpsDesc);//using printf method to display the summary properly
		System.out.printf("Rental subtotal: $%.2f\n", _subTotal);//using printf method to display the summary properly
		System.out.printf("Tax amount: $%.2f\n", _taxAmt);//using printf method to display the summary properly
		System.out.printf("Total amount: $%.2f\n", _totalAmt);//using printf method to display the summary properly
		System.out.println("System coded by Paulo Borba 300268640");//using println method to display the developer's name and ID
	}
}
