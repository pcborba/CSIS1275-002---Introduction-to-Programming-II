import java.util.Scanner;

public class QuizzJ {

	public static void main(String[] args) 
	{
		// Declare MAX_STRING_LENGTH as an integer constant initialized with 20
		final int MAX_STRING_LENGTH = 20;
		
		
		String inputString;
		
		System.out.println("Enter your input string");
		
		// Use the Scanner class to insert code for reading a string from the keyboard, and
		Scanner kbd = new Scanner(System.in);
		
		// store it in the inputString
		inputString = kbd.nextLine();
		
		
		char[] reverseString = new char[MAX_STRING_LENGTH];
		
		// Write code to store the inputString characters into the reverseString array in
		// reverse order
		
		System.out.println(inputString.length());
		
		int sizeInput = inputString.length();
		int i = sizeInput-1;
		int j = 0;
		do
		{
			reverseString[j] = inputString.charAt(i);
			j++;
			i--;
		}
		while(j<sizeInput);
				
		// Insert code to print the content of the reverseString array on the console
		System.out.println(reverseString[3]);
		String tes = "";
		for (int index = 0; index<reverseString.length;index++)
		{
			tes += reverseString[index];
		}
		System.out.println(reverseString.length);
		System.out.println(tes);
	}

}
