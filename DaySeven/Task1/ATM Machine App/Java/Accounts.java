
public class Accounts
{
	public static double deposit(double amount, double balance)
	{
		balance = balance + amount;

		return balance;
	} 

	public static double withdraw(double balance, double withdrawAmount)
	{	
		if (withdrawAmount > balance || withdrawAmount <= 0)
		{
			return 0;
		} else {
			return balance - withdrawAmount;
		}		
	} 
}