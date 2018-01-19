import java.io.*;
import java.util.Scanner;


public class SeqSearch {
	
	public static void main(String[] args)
	{
		
		int [] num = {1,2,3,4,5,6};
		
		int src; 
		Scanner kbd = new Scanner(System.in);
		System.out.println("Type a number from to search.");
		src = kbd.nextInt();

		boolean numb = false;
		
		for(int i=0; i < num.length; i++)
		{
			if(src == num[i])
			{
				System.out.println("We found the number " + num[i] + " in our file.");
				numb = true;
				break;
			}
		}
		
		if (numb == false)
		{
			System.out.println("We didn't found your number in our file.");
		}
	}


}
