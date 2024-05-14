
public class Accounts
{
	public static double deposit(double balance, double amount)
	{
		double newAmount = 0;
		newAmount = newAmount + amount;

		return newAmount;
	} 

	public static double withdraw(double balance, int withdrawAmount)
	{	
		double newAmount = 0;
		if (withdrawAmount > newAmount || withdrawAmount <= 0)
		{
			newAmount = balance - withdrawAmount;
			return 0;
		} else {
			return newAmount;
		}		
	} 
}