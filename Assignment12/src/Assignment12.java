 /* Assignment java 1
	 * Group members:
	 * Yunjie Gao		Student ID : 300267900
	 * Ngoc Tuan Nguyen	Student ID : 300265666
	 * PAULO CESAR BORBA Student ID: 300268640
	 * 
	 * */
	import java.util.List;
	import java.util.Scanner;
	import java.nio.charset.Charset;
	import java.nio.file.Files;
	import java.nio.file.Paths;
	import java.nio.file.StandardOpenOption;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

	public class Assignment12 {

		public static void main(String[] args)throws IOException {
			// TODO Auto-generated method stub
			Assignment12 objAssignment = new Assignment12();
			//----------------------------------------------------
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
			// have to test the system.in has next line or not.
			while(s.hasNextLine())	{	filename = s.nextLine(); break;	}
			// check exist file
			File f = new File(filename);
			boolean exist = f.exists();
			
			if(exist)
				System.out.println("File is existed.");
			else
			{			
				//
				System.out.println("Input content to file until line has #:");
				// read one line for content of file
				String content = this.InputContent(); 			
				// write to file
				PrintWriter outFile= new PrintWriter(f);
				outFile.print(content);
				outFile.close();
				
			}
			
			// wait enter key
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
			// assume no # in text file, # only for existing input content of file
			String rs = content.toString().replaceAll("#", "");
			return rs;
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
			
			File f = new File(filename);
			boolean exist = f.exists();
			// check exist file
			if(!exist)
				System.out.println("File is not existed.");
			else
			{			
				// just read the text file not binary
				// scanner for read text file
				Scanner textFile = new Scanner(f);
		
			      // Read lines from the file until no more are left.
			      while (textFile.hasNext())
			      {
			    	  String line = textFile.nextLine();
			    	  System.out.println(line);	
			      }	 
			      textFile.close();// close file
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
			File file = new File(filename);
			boolean exist = file.exists();
			// check exist file
			if(!exist)
				System.out.println("File is not existed.");
			else
			{	
				// check encode file
				if(filename.startsWith("_")) 
					System.out.println("File is encoded.");
				else
				{
					System.out.println("Input content to append file until #:");
					// read input until # will be inputed
					String content = this.InputContent();
					// filewriter for append 
					FileWriter fwriter = new FileWriter(file,true);
			    	BufferedWriter bwriter = new BufferedWriter(fwriter);
			    				   
				    PrintWriter outFile = new PrintWriter(bwriter);
				    outFile.print(content); // append to file 
				    outFile.close();		// close file
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
			while(s.hasNextLine())	{ filename = s.nextLine();break; }
			// check exist file
			
			File f = new File(filename);
			boolean exist = f.exists();
			// check exist file
			if(!exist)
				System.out.println("File is not existed.");
			else
			{	
				// check encode file
				if(filename.startsWith("_")) System.out.println("File is encoded.");
				else
				{
					String encFilename = String.format("%s%s","_",filename);
						

					File fe = new File(encFilename);
					boolean encExist = fe.exists();
					
					if(encExist) System.out.println("This file name has an encrypted file as well. Delete that cipher file before re");
					else{		
						System.out.println("Input character will be replace:");
						String replaceChr= Character.toString(s.next().charAt(0));// read one character will be replaced
						String cipherInvertedQuestion = "\u00BF";				// special character will replace
						
						// scanner for read text file
						Scanner textFile = new Scanner(f);
						// file name of cipherfile
						String cipherFileName = String.format("_%s", filename);
						// file writer
						PrintWriter cipherFile = new PrintWriter(cipherFileName);
					      // Read lines from the file until no more are left.
					      while (textFile.hasNext())
					      {
					         // Read the next name.
					         String line = textFile.nextLine();
					         String cipherLine =  line.replace(replaceChr, cipherInvertedQuestion);
					         cipherFile.println(cipherLine);
					      }
					      textFile.close();// close text file
					      cipherFile.close(); // close cipher file
					}
				}
			}			
			// wait for enter key to go back to menu
			System.out.println("Press enter key to come back to menu");
			System.in.read();	
			
		}
			
	}
