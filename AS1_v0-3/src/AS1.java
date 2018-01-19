import java.util.Scanner;
import java.io.*;

public class AS1 
{

	public static void main(String[] args) throws IOException
	{
		option();
	}
	
	public static void option() throws IOException
	{
		char option;
		
		welcome();
		
		Scanner kbd = new Scanner(System.in);

		option = kbd.nextLine().charAt(0);

		System.out.println(option);
		
		while (option != 'c' && option != 'C'
				&& option != 'r' && option != 'R'
				&& option != 'a' && option != 'A'
				&& option != 'e' && option != 'E'
				&& option != 't' && option != 'T'
				)
			{
				clearScreen();
				System.out.println("Invalid option. Press ENTER to continue.");
				kbd.nextLine();
				clearScreen();
				welcome();
				option = kbd.nextLine().charAt(0);
			}

		switch(option)
		{
        case 'c':
           methodC();
           break;
        case 'C':
            methodC();
            break;
        case 'r':
            methodR();
            break;
        case 'R':
             methodR();
             break;
        case 'a':
            methodA();
            break;
        case 'A':
             methodA();
             break;
        case 'e':
            methodE();
            break;
        case 'E':
             methodE();
             break;        
        case 't':
            methodT();
            break;
        case 'T':
             methodT();
             break;             
		}
		
		kbd.close();
	}
	
	public static void welcome() throws IOException
	{
		clearScreen();
		String mainMenu = ("What can I help you with? Please select an option to continue: \n"
				+ "\n"
	            + "Press 'C' to create a new text file.\n"
	            + "\n"
	            + "Press 'R' to retrieve the content of an existing text file.\n"
	            + "\n"
	            + "Press 'A' to append to an existing text file.\n"
	            + "\n"
	            + "Press 'E' to encode an existing text file.\n"
	            + "\n"
	            + "Press “T” to terminate the program.");

		System.out.println(mainMenu);
	}
	
	public static void methodC() throws IOException
	{
		System.out.println("MethodC !!");
		
		String fName; 
		Scanner kbd = new Scanner(System.in);
		clearScreen();
		System.out.println("To create the file please insert the a name");
		fName = kbd.nextLine();
		File inpFile = new File (fName+".txt");
		if (inpFile.exists())
		{
			clearScreen();
			System.out.println("This file already exists! Press ENTER to continue.");
			kbd.nextLine();
			clearScreen();
			option();
		}
		else
		{
			FileWriter inFile = new FileWriter(fName+".txt");
			clearScreen();
			System.out.println("Type the content to the file!");
			inFile.write(kbd.nextLine());
			inFile.close();
			clearScreen();
			option();
		}
	}

	public static void methodR() throws IOException
	{
		System.out.println("MethodR !!");
		
		String fName; 
		Scanner kbd = new Scanner(System.in);
		clearScreen();
		System.out.println("Insert the name of the file tha you want to retrieve");
		
		fName = kbd.nextLine();
		File inpFile = new File (fName+".txt");
		if (!inpFile.exists())
		{
			clearScreen();
			System.out.println("This file does not exist! Press ENTER to continue");
			kbd.nextLine();
			clearScreen();
			option();
		}
		else
		{
			Scanner inFile = new Scanner(inpFile);
			clearScreen();
			System.out.println("The data between lines is inside of the file that you choose.");
			System.out.println("\n");
			System.out.println("--------------------------------------------------------");
			while (inFile.hasNext())
			{
				String str = inFile.nextLine();
				System.out.println(str);
			}
			System.out.println("\n");
			System.out.println("--------------------------------------------------------");
			System.out.println("\n");
			System.out.println("End of the file! Press ENTER to continue");
			kbd.nextLine();
			inFile.close();
			clearScreen();
			option();
		}
	}

	public static void methodA() throws IOException
	{

	}
	
	public static void methodE() throws IOException
	{

	}
	
	public static void methodT() throws IOException
	{
		clearScreen();
		System.out.println("Thank you for being using our application.");
		System.exit(0);
	}

	public static void clearScreen() throws IOException
    {
        for (int y = 0; y < 50; y++)
        System.out.println("\n");
 
    }
	

}

