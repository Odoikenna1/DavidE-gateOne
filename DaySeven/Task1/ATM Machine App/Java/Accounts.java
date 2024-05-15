import java.util.Scanner;
import java.util.ArrayList;

public class Accounts
{	
	private static ArrayList<Object> customerData = new ArrayList<>();

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