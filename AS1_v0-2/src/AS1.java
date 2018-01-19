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
		
		mainScreen();
		
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
				System.out.println("Invalid option");
				Test();
				mainScreen();
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
		}
		
		kbd.close();
	}
	
	public static void mainScreen() throws IOException
	{
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
		
		System.out.println("To create the file please insert the a name");
		fName = kbd.nextLine();
		File inpFile = new File (fName+".txt");
		if (inpFile.exists())
		{
			Test();
			System.out.println("This file already exists!");
			option();
		}
		else
		{
			FileWriter inFile = new FileWriter(fName+".txt");
			Test();
			System.out.println("Type the content to the file!");
			inFile.write(kbd.nextLine());
			inFile.close();
			option();
		}
	}

	public static void methodR() throws IOException
	{
		System.out.println("MethodR !!");
		
		String fName; 
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Insert the name of the file tha you want to retrieve");
		fName = kbd.nextLine();
		File inpFile = new File (fName+".txt");
		if (!inpFile.exists())
		{
			Test();
			System.out.println("This file does not exist!");
			option();
		}
		else
		{
			Scanner inFile = new Scanner(inpFile);
			while (inFile.hasNext())
			{
				String str = inFile.nextLine();
				System.out.println(str);
			}
			inFile.close();
			Test();
			option();
		}
	}

	

	public static void Test() throws IOException
    {
        for (int y = 0; y < 25; y++)
        System.out.println("\n");
 
    }
	

}

