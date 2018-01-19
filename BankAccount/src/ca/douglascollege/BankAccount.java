package ca.douglascollege;
public class BankAccount {

	
	private String _str, _strStartBalance, _strBalance;
	private double _startBalance, _amount, _balance;
	
	public BankAccount()
	{
		_balance = 0.0;
	}
	
	public BankAccount(double startBalance)
	{
		_startBalance = startBalance;
		_balance = _startBalance;
	}
	
	public BankAccount(String strString)
	{
		_strStartBalance = strString;
		_strBalance = _strStartBalance;
	}
	
	
	public void deposit(double amount)
	{
		_amount = amount;
		_balance += _amount;
	}
	
	public void deposit(String str)
	{
		_str = str;
	}
	
	public void withdraw(double amount)
	{
		_amount = amount;
		_balance -= _amount;
	}
	
	public void withdraw(String str)
	{
		_str = str;
	}
	
	public void setBalance(double b)
	{
		_balance = b;
	}
	
	public void setBalance(String str)
	{
		_str = str;
	}
	
	public double getBalance()
	{
		return _balance;
	}
	
}
