import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Assig01
{
	public static void main (String[] args) throws IOException
	{
		
		int[] intArray = {1, 6, 8, 3, 15, 4, 12, 5, 9, 31, 0};
		
		System.out.println("What would be the index of the first element of the intArray if the array was sorted in a descending order? ");
		for(int i = 1, x = 0; i < intArray.length; i++)
		{
			if(intArray[i] > intArray[0] )
			{
				x++;
			}
			System.out.println(x);
		}

		System.out.println("What is the minimum number in the intArray? ");

		
		for(int i = 1, x = intArray[0] ; i < intArray.length; i++)
		{
			if(intArray[i] < x)
			{
				x = intArray[i];
			}
			System.out.println(x);
		}
		
		System.out.println("What would be the index of the first element of the intArray if the array was sorted in an ascending order?");

		
		for(int i = 1, x = 0; i < intArray.length; i++)
		{
			if(intArray[i] < intArray[0] )
			{
		          x++;
			}
			System.out.println(x);
		}
		
		System.out.println("What is the maximum number in the intArray?");

		
		for(int i = 1, x = intArray[0] ; i < intArray.length; i++)
		{
			if(intArray[i] > x)
			{
		          x = intArray[i];
			}
			System.out.println(x);
		}

		     
		
		    
/*

			
		

		


			
		for(int i = 1, x = intArray[0] ; i < intArray.length; i++)

		     if(intArray[i] > x)

		          x = intArray[i];*/
		
		/*int[] intArray = {1, 6, 8, 3, 15, 4, 12, 5, 9, 31, 0};
		
		int minimun = intArray[0];
		
		for (int i =1; i < intArray.length; i++)
		{
			if (minimun > intArray[i])
			{
				minimun = intArray[i];
			}
		}
		
		System.out.println(minimun);
		char charVar = 'A';
		short shortVar = 12;
		long longVar = -126;
		double doubleVar = 1.8;
		
		
		int intVar = (charVar + shortVar); //ok NC
		float floatVar =  (float)(intVar *1.2); //float floatVar =  (intVar *1.2); 
		doubleVar = (floatVar + longVar / 3); //ok NC
		floatVar= (float) (1.8 + 4);  // floatVar= (1.8 + 4); 
		charVar = new Character('B'); //ok NC
		longVar = (long)Float.parseFloat("27.4"); // longVar = Float.parseFloat("27.4");

		
		float[] arr_Credit = {3, 2, 4, 1};
		float[] arr_Grade = {10, 30, 20, 15};
		
		ArrayList<Float> al_grade = new ArrayList<Float>();
		
		float creditAmt = 0;
		float gradeCreditAmt = 0;
		float weiAvg = 0;
		int i=0;
		
		for(float value: arr_Grade)
		{
			al_grade.add(value);
			gradeCreditAmt += (al_grade.get(i)*arr_Credit[i]);
			creditAmt += arr_Credit[i];
			i++;
		}
		
		System.out.println("The weighted average is "+ gradeCreditAmt/creditAmt);*/
//////////////////////////////////////////////////////////////////////////////////////
		/*Scanner kbd = new Scanner(System.in);
		char choice=' ';
		
		while(choice!='-')
		{
			char created = 'n';
			while(created!='y')
			{
				System.out.println("Please type the name of your file");
				String fileN = kbd.nextLine();
				String content ="";
				System.out.println("Do you want to create it as an encoded file? Answer Y or N");
				choice = kbd.nextLine().charAt(0);
				if(choice == 'y' || choice == 'Y')
				{
					File fEtest =  new File("_"+fileN+".txt");
					if (fEtest.exists())
					{
						System.out.println("This file already Exists en an encoded version!");
					}
					else
					{
						char charRep =' ';
						String encContent="";
						System.out.println("Please type the character that you want to replace during the encoding process.");
						System.out.println("\"You must register this information in a safe place, because it is your key to decode it in the future\"");
						charRep = kbd.nextLine().charAt(0);
						
						FileWriter fEu = new FileWriter(fEtest, true);
						PrintWriter fileEncUser = new PrintWriter(fEu);
						System.out.println("Please type the content that you want to put inside the file, when finished type #");
						while(choice!='#')
						{
							content = kbd.nextLine();
							if (!content.contains("#"))
							{
								encContent = content.replace(charRep, '?');
								fileEncUser.println(encContent);
							}
							else
							{
								encContent = content.replace(charRep, '?');
								fileEncUser.println(encContent.replace("#", ""));
								choice ='#';
							}
						}
						fEu.close();
						fileEncUser.close();
					}
				}
				else
				{
					File fTest = new File(fileN+".txt");
					if(fTest.exists())
					{
						System.out.println("This file already exists");
					}
					else
					{
						FileWriter fU = new FileWriter(fileN, true);
						PrintWriter fileUser = new PrintWriter(fTest);
						System.out.println("Please type the content that you want to put inside the file, when finished type #");
						
						while(choice!='#')
						{
							content= kbd.nextLine();
							if(!content.contains("#"))
							{
								fileUser.println(content);
							}
							else
							{
								fileUser.println(content.replace("#", ""));
							}
						}
					
					fU.close();
					fileUser.close();
					
					}
				}
			}
		}
		
		 int idade = 30;
		String id = Integer.toString(idade);
		System.out.println(id);
		
		String valor = "30.3";
		float idade2 = Float.parseFloat(valor);
		System.out.printf("%.3f", idade2);	
				
		char charVar = 'A'; 
		System.out.println(charVar);
		short shortVar = 12;
		System.out.println(shortVar);
		long longVar = -126;
		System.out.println(longVar);
		double doubleVar = 1.8;
		System.out.println(doubleVar);
		int intVar = (charVar + shortVar); 
		System.out.println(intVar);
		float floatVar =  (intVar * Float.parseFloat("1.2"));	
		System.out.println(floatVar);
		doubleVar = (intVar * 1.2);
		System.out.println(doubleVar);
		floatVar = (floatVar + longVar / 3);
		System.out.println(floatVar);
		floatVar = Float.parseFloat("1.8") + 4; 
		System.out.println(floatVar);
		//charVar = (1.8 + 4); 
		//new Character('B');
		//System.out.println(charVar);
		longVar = Long.parseLong("27.4");
		System.out.println(longVar);
		System.out.println(Float.parseFloat("27.4"));
		
		
		
		int[] intArray = {1, 6, 8, 3, 15, 4, 12, 5, 9, 31, 0};
		
		
		int minimum = intArray[0];
		
		for(int i = 1; i <intArray.length;i++)
		{
			if(intArray[i]<minimum)
			{
				minimum = intArray[i];
			}
		}
		
		//System.out.println(minimum);
		
		System.out.println("-------------------------------------------------------------------------");
		

		float[] arr_Credit = {10,12,20,30};
		float[] arr_Nota = {7,3,7,8};
		
		ArrayList<Float> avr = new ArrayList<Float>();
		
		float notasAmt = 0, creditAmt = 0;;

		int i = 0;
		for (float notas: arr_Nota)
		{
			avr.add(notas);
			notasAmt += notas*arr_Credit[i];
			creditAmt += arr_Credit[i];
			i++;
		}

		float weiAvg = notasAmt/creditAmt;
		
		System.out.println("The Weighted Average is "+ weiAvg);
		
		
		char charVar = 'A';
		short shortVar = 12;
		long longVar = -126;
		double doubleVar = 1.8;
		
		int intVar = (charVar + shortVar); NC
		float floatVar =  (float)(intVar *1.2);
		doubleVar = (floatVar + longVar / 3);NC
		floatVar= (float)(1.8 + 4);  
		charVar = new Character('B'); NC
		longVar = (long) Float.parseFloat("27.4");
		
		
		
		int minimum  = intArray[0];
		for (int i = 1; i < intArray.length; i++)
		{
			System.out.println(i);
			if (intArray[i] < minimum )
			{
				minimum  = intArray[i];
			}
		}
		
		System.out.println("");
		System.out.println(minimum);
		
		for (int i=0; i< intArray.length; i++)
		{
			if (intArray[i]==minimum)
			{
				System.out.println("The minimum value is in the index "+i);
			}
		}
		System.out.println("");


		
		int maximum  = intArray[0];
		for (int i = 1; i < intArray.length; i++)
		{
			System.out.println(i);
			if (intArray[i] > maximum )
			{
				maximum  = intArray[i];
			}
		}
		
		System.out.println("");
		System.out.println(maximum);
		
		for (int i=0; i< intArray.length; i++)
		{
			if (intArray[i]==maximum)
			{
				System.out.println("The maximum value is in the index "+i);
			}
		}
		
		
		System.out.println("");
		System.out.println("");
		

		for (int i=0; i< intArray.length; i++)
		{
			if (intArray[i]==maximum)
			{
				System.out.println("The maximum value is in the index "+i);
			}
		}
		
		
		int firstElement = intArray[0];
		
		Arrays.sort(intArray);
		
		
		System.out.println(intArray[10]);
		
		for (int i=0; i< intArray.length; i++)
		{
			if (intArray[i]==firstElement)
			{
				System.out.println("The original first element of the array is now index "+i);
			}
		}
		
		
		System.out.println(intArray[10]);
		
		for (int i=0; i< intArray.length; i++)
		{
			if (intArray[i]==firstElement)
			{
				System.out.println("The original first element of the array is now index "+i);
			}
		}
		
		
		
		
		
			byte b=12;
			char c= 'a';
			short s=1004;
			int i=20000;
			float f=5.67f;
			double d=.1234;
			double res=(f*b)+(i/c) -(d*s);
			System.out.println("result : result : result :result :" +res);

			
		ArrayList<Float> credit = new ArrayList<Float>();
		
		
			
		float a = (float)18.2;
		
	
		Scanner kbd = new Scanner(System.in);
		boolean finApp = false;
		
		while (finApp==false)
		{
			System.out.println("What can i help you with? Please select an option to continue:");
			System.out.println("Press \"C\" to create a new text file");
			System.out.println("Press \"R\" to retrieve the content of an existing text file");
			System.out.println("Press \"A\" to append to an existing text file");
			System.out.println("Press \"E\" to encode an existing text file");
			System.out.println("Press \"T\" to terminate the program");
			char option = kbd.nextLine().charAt(0);
			
			if (option =='c' || option =='C')
			{
				System.out.println("Please insert the name to your file");
				String fileName = kbd.nextLine();
				File userFile = new File(fileName+".txt");
				File eUserFile = new File("_"+fileName+".txt");
				if(eUserFile.exists())
				{
					System.out.println("This file already exists in a encoded version!");
					
				}
				else if(userFile.exists())
				{
					System.out.println("This file already exists!");
				}
				else
				{
					System.out.println("Please insert the content to the file, when finishing type # to return to menu");
					char editing = ' ';
					String content="";
					PrintWriter fileN = new PrintWriter(userFile);
					
					while(editing!='#')
					{
						content = kbd.nextLine();
						if (content.contains("#"))
						{
							fileN.println(content.substring(0, content.length()-1));
							editing = '#';
						}
						else
						{
							fileN.println(content);
						}
					}
					fileN.close();
				}
				System.out.println("\n\n\n\n\n\n");
			}
			
			if (option =='r' || option =='R')
			{
				System.out.println("Please insert the name of the file you want to read");
				String fileName = kbd.nextLine();
				File userFile = new File(fileName+".txt");
				File eUserFile = new File("_"+fileName+".txt");
				if(eUserFile.exists())
				{
					System.out.println("This file is encoded you can not read it!");
					
				}
				else if(!userFile.exists())
				{
					System.out.println("This file does not exists!");
				}
				else
				{
					Scanner file = new Scanner(userFile);
					while(file.hasNext())
					{
						System.out.println(file.nextLine());
					}
					file.close();
				}
				System.out.println("\n\n\n\n\n\n");
			}

			if (option =='a' || option =='A')
			{
				System.out.println("Please insert the name of the file you want to append.");
				String fileName = kbd.nextLine();
				File userFile = new File(fileName+".txt");
				File eUserFile = new File("_"+fileName+".txt");
				if(eUserFile.exists())
				{
					System.out.println("This file is encoded you can not append it!");
					
				}
				else if(!userFile.exists())
				{
					System.out.println("This file does not exists!");
				}
				else
				{
					FileWriter nFile = new FileWriter(userFile, true);
					PrintWriter uFile = new PrintWriter(nFile);
					String content="";
					char editing = ' ';
					System.out.println("Please type the content that you want to appen to finish type #.");
					while(editing!='#')
					{
						content = kbd.nextLine();
						if(content.contains("#"))
						{
							uFile.println(content.substring(0, content.length()-1));
							editing = '#';
						}
						else
						{
							uFile.println(content);
						}
					}
					nFile.close();
					uFile.close();
				}
				System.out.println("\n\n\n\n\n\n");	
			}
			
			if (option =='e' || option =='E')
			{
				System.out.println("Please insert the name of the file you want to encode");
				String fileName = kbd.nextLine();
				File userFile = new File(fileName+".txt");
				File eUserFile = new File("_"+fileName+".txt");
				if(eUserFile.exists())
				{
					System.out.println("This file is already encoded!");
					
				}
				else if(!userFile.exists())
				{
					System.out.println("This file does not exists!");
				}
				else
				{
					System.out.println("Enter a specific character you want to replaced in the file!");
					char charReplace = kbd.nextLine().charAt(0);
					String content, contEncoded;
					Scanner file = new Scanner(userFile);
					PrintWriter _file = new PrintWriter("_"+userFile);
					while(file.hasNext())
					{
						content = file.nextLine();
						contEncoded = content.replace(charReplace, '?');
						_file.println(contEncoded);
					}
					file.close();
					_file.close();
					userFile.delete();
				}
				System.out.println("\n\n\n\n\n\n");
			}

			if (option =='t' || option =='T')
			{
				System.out.println("Thank you for use our File Manager. Press any key to exit.");
				kbd.close();
				System.exit(0);
			}
		}*/
	}
}
