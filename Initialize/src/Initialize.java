import java.io.*;
import javax.swing.JOptionPane;

public class Initialize {
	
	
	public static void main (String[] args) throws IOException
	{
		
		int month, days;
		int hours = 10;
		double grossPay = 10.45;
		String name = "Ringo";
		month = 2;
		days = 28;
		System.out.println("Month " + month + " has " + days + "days."); 
		System.out.printf("I worked %d \n", hours);
		System.out.printf("Your pay is %25.2f \n", grossPay);
		System.out.printf("Your name is %12s \n", name);
		
		JOptionPane.showMessageDialog(null, "Hello World");
		
		String name2;
		name2 = JOptionPane.showInputDialog("Enter your file name");

		while (name2==null)
			{
				JOptionPane.showMessageDialog(null, "Please type your file name");
				name2 = JOptionPane.showInputDialog("Enter your file name");
			}
		
		PrintWriter outputFile = new PrintWriter(name2+".txt");
		
		outputFile.println("Jim");
		outputFile.print("95 ");
		outputFile.print("96 ");
		outputFile.print("97 ");
		outputFile.print("98 ");
		outputFile.println("99 ");
		outputFile.println("100 ");
		outputFile.close();
		
		
	}

}
