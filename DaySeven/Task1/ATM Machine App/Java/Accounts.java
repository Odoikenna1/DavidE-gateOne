import java.util.Scanner;
import java.security.SecureRandom;
import java.util.ArrayList;

public class Accounts
{	
	ArrayList<Object> customerData = new ArrayList<>();
	SecureRandom newUserAccountNumber = new SecureRandom();

	public static void addCustomerNameAndAccountNumberToDataBase(String userInput)
	{
		customerData.add(userInput);
		long accountNumber = newUserAccountNumber.nextLong(); 
		String accountNumberTostring = String.valueOf(accountNumber);
		customerData.add(accountNumberTostring);
	}

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