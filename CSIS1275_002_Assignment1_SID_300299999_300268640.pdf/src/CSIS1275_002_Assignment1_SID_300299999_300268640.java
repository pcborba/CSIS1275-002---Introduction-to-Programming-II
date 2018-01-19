import java.util.Scanner;
import java.io.*;

public class CSIS1275_002_Assignment1_SID_300299999_300268640 {
	public static void main (String[] args) throws IOException
	{
		
		String fileName;
		String firstMenu;
		
		Scanner kbd = new Scanner(System.in);
		System.out.println("What can I help you with? Please select an option to continue:");
		System.out.println("");
		System.out.println("Press \"C\" to create a new text file.");
		System.out.println("");
		System.out.println("Press \"R\" to retrieve the content of an existing text file.");
		System.out.println("");
		System.out.println("Press \"A\" to append to an existing text file.");
		System.out.println("");
		System.out.println("Press \"E\" to encode an existing text file");
		System.out.println("");
		System.out.println("Press \"T\" to terminate the program");

		firstMenu = kbd.nextLine();
		
		System.out.println(firstMenu);
		
		kbd.nextLine();
		
		
		if (firstMenu == "C" || firstMenu == "c");
		{
			System.out.println("Please insert the file name");
			fileName = kbd.nextLine();
			
			
			File file = new File(fileName+".txt");
			if (file.exists())
			{
				System.out.println("The file" + file + "already exists please insert another name.");
				System.exit(0);
			}
		}		
	}
}
