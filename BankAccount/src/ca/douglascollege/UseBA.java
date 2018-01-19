package ca.douglascollege;
import java.io.IOException;
import java.util.Scanner;
public class UseBA {

	public static void main(String[] args) throws IOException
	
	{
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		
		boolean fim = false;
		while (!fim)
		{

			System.out.println("Please type one of the option to procede:");
			System.out.println("C - Create an account:");
			System.out.println("D - Deposit");
			System.out.println("W - Withdraw");
			System.out.println("T - Terminate");
			String option = kbd.nextLine();	
			
			System.out.println(option);
			
			if (option.contains("c"))
			{
				System.out.println("Please insert a value do start the balance in your new account");
				double startBalanceAccount = kbd.nextDouble();
				BankAccount bc = new BankAccount(startBalanceAccount);
				System.out.println(bc.getBalance()); 
				System.out.println("Type any key to continue");
				
			}

		}

		/*
		
		Scanner kbd = new Scanner(System.in);
		
		

		
		System.out.println("Please insert the value to deposit in your new account");
		startBalanceAccount = kbd.nextDouble();
		bc.deposit(startBalanceAccount);
		System.out.println(bc.getBalance()); 
		
		
		System.out.println("Please insert the value to withdraw from your new account");
		startBalanceAccount = kbd.nextDouble();
		bc.withdraw(startBalanceAccount);
		System.out.println(bc.getBalance()); 
		*/

	}

}
