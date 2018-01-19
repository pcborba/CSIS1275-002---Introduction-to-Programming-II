/*
 * Assignment java 1
 * Ngoc Tuan Nguyen	300265666
 * 
 * */
import java.util.List;
import java.util.Scanner;
import java.lang.System.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Assignment1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Assignment1 objAssignment = new Assignment1();
		//
		objAssignment.Menu();
	}
	
	public void Menu() throws IOException
	{
		Boolean quit = false;
		Scanner s = new Scanner(System.in);
		
		while(!quit)
		{
		
			System.out.println("What can i help you with? Please select an option to continue:");
			System.out.println("Press \"C\" to create a new text file");
			System.out.println("Press \"R\" to retrieve the content of an existing text file");
			System.out.println("Press \"A\" to append to an existing text file");
			System.out.println("Press \"E\" to encode an existing text file");
			System.out.println("Press \"T\" to terminate the program");
			
			char input = s.next().charAt(0);
			
			// convert to lower case
			input = java.lang.Character.toUpperCase(input);
			
			switch (input)
			{
				case 'C': this.CreateNewFile( ); break;
				case 'R': this.ReadFile( ); break;
				case 'A': this.AppendFile( ); break;
				case 'E': this.EncodeFile( ); break;
				case 'T': quit= true; break;				
			}	
		}// end while
		s.close();
	}
	// function create new file
	public void CreateNewFile() throws IOException
	{
		Scanner s = new Scanner(System.in);		
		//--------------------------------
		System.out.println("Enter the file name of text file for creating:");
		String filename = "";
		while(s.hasNextLine())
		{
			filename = s.nextLine();
			break;
		}
		// check exist file
		boolean exist = Files.exists(Paths.get(filename));
		
		if(exist)
			System.out.println("File is existed.");
		else
		{			
			//
			System.out.println("Input content to file until #:");
			// read one line for content of file
			String content = this.InputContent(); 			
			// write to file
			Files.write(Paths.get(filename), content.toString().getBytes());									
		}
		
		// wait for any key to go back to menu
		System.out.println("Press enter key to come back to menu");
		System.in.read();
	
	}

	// read input until # appear
	public String InputContent()
	{
		Scanner s = new Scanner(System.in);		
		StringBuilder content = new StringBuilder("");
		String line = "";
		while(s.hasNextLine())
		{
			line = s.nextLine();			
			content.append(line);
			content.append("\n");
			if(line.contains("#")) break;
		}		
		return content.toString();
	}
	// function create new file
	public void ReadFile() throws IOException
	{
		Scanner s = new Scanner(System.in);
		//--------------------------------
		System.out.println("Enter the file name of text file for reading:");
		String filename = "";		
		while(s.hasNextLine())
		{
			filename = s.nextLine();
			break;
		}
		// check exist file
		boolean exist = Files.exists(Paths.get(filename));
		// check exist file
		if(!exist)
			System.out.println("File is not existed.");
		else
		{			
			 List<String> content = Files.readAllLines(Paths.get(filename), Charset.forName("Cp1252"));
			 for (String line : content) {
				 System.out.println(line);	
			}		 
			 
		}			
		// wait for any key to go back to menu
		System.out.println("Press enter key to come back to menu");
		System.in.read();		
	}
	
	// function append new file
	
	public void AppendFile() throws IOException
	{
		Scanner s = new Scanner(System.in);		
		//--------------------------------
		System.out.println("Enter the file name of text file:");
		String filename = "";		
		while(s.hasNextLine())
		{
			filename = s.nextLine();
			break;
		}
		// check exist file
		boolean exist = Files.exists(Paths.get(filename));
		// check exist file
		if(!exist)
			System.out.println("File is not existed.");
		else
		{	
			// check encode file
			if(filename.startsWith("_")) System.out.println("File is encoded.");
			else
			{
				System.out.println("Input content to append file until #:");
				// read one line for content of file
				String content = this.InputContent();
				//
			    Files.write(Paths.get(filename), content.getBytes(), StandardOpenOption.APPEND);	
			}			
		}		
		// wait for any key to go back to menu
		System.out.println("Press enter key to come back to menu");
		System.in.read();		
	}
	
	// function create new file
	public void EncodeFile() throws IOException
	{
		Scanner s = new Scanner(System.in);	
		//--------------------------------
		System.out.println("Enter the file name of text file:");
		String filename = "";		
		while(s.hasNextLine())
		{
			filename = s.nextLine();
			break;
		}
		// check exist file
		
		boolean exist = Files.exists(Paths.get(filename));
		// check exist file
		if(!exist)
			System.out.println("File is not existed.");
		else
		{	
			// check encode file
			if(filename.startsWith("_")) System.out.println("File is encoded.");
			else
			{
				System.out.println("Input character will be replace:");
				String replaceChr= Character.toString(s.next().charAt(0));
				String cipherInvertedQuestion = "\u00BF";
				
				StringBuilder cipherText = new StringBuilder("");
				// read only content form filename
				List<String> content = Files.readAllLines(Paths.get(filename));
				 for(String line: content)
				 {
					 String cipherLine = line.replace(replaceChr, cipherInvertedQuestion);
					 cipherText.append(cipherLine);
				 }				
				// save cipher
				 String cipherFileName = String.format("_%s", filename);
				Files.write(Paths.get(cipherFileName), cipherText.toString().getBytes());
			}
		}			
		// wait for any key to go back to menu
		System.out.println("Press enter key to come back to menu");
		System.in.read();	
		
	}
		
}

