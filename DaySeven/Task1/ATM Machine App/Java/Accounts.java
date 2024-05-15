import java.util.Scanner;
import java.security.SecureRandom;
import java.util.ArrayList;

public class Accounts
{	
	private static ArrayList<String> customerName = new ArrayList<>();
	private static ArrayList<String> customerAccountNumber = new ArrayList<>();
	private static ArrayList<Double> customerAccountBalance = new ArrayList<>();
	private static ArrayList<String> customerPin = new ArrayList<>();

	private static SecureRandom newUserAccountNumber  = new SecureRandom();
	private static double accountBalance = 0.00;

	public static void createCustomerProfileAndPopulateDataBase(String userName, String pin)
	{
		customerName.add(userName);
		long accountNumber = newUserAccountNumber.nextLong(); 
		String accountNumberTostring = String.valueOf(accountNumber);
		customerAccountNumber.add(accountNumberTostring);
		customerPin.add(pin);
	}

	public static void initializeAccountBalance()
	{
		customerAccountBalance.add(accountBalance);
	}
	public static double depositFunds(String accountNumberTostring, double depositAmount)
	{
		
		if(customerAccountNumber.contains(accountNumberTostring)){
		int index = customerAccountNumber.indexOf(accountNumberTostring);
		accountBalance = customerAccountBalance.get(index);
		accountBalance = accountBalance + depositAmount;
		customerAccountBalance.set(index, accountBalance);
		}
		
		return accountBalance;
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