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
	public static double depositFunds(String accountNumberTostring, double depositAmount, String pin)
	{	
		if(customerAccountNumber.contains(accountNumberTostring))
		{
		int index = customerAccountNumber.indexOf(accountNumberTostring);
		accountBalance = customerAccountBalance.get(index);
			if(customerPin.get(index).equals(pin))
			{
			accountBalance = accountBalance + depositAmount;
			customerAccountBalance.set(index, accountBalance);
			}
		}
		return accountBalance;
	} 

	public static String withdraw(String accountNumberTostring, double balance, double withdrawAmount, String pin)
	{
		String updatedBalance = "";
		double temp = 0;
		if(customerAccountNumber.contains(accountNumberTostring))
		{
			int index = customerAccountNumber.indexOf(accountNumberTostring);
			accountBalance = customerAccountBalance.get(index);
				if(customerPin.get(index).equals(pin))
				{
					if(accountBalance < withdrawAmount)
					{
					return "Insuffient funds";	
					} else {
						accountBalance = accountBalance - withdrawAmount;
						temp = accountBalance;
						customerAccountBalance.set(index, accountBalance);
						updatedBalance = String.valueOf(temp);
						return updatedBalance;
					}
				}
		}return updatedBalance;	
	}

	public static double checkBalance(String accountNumber)
	{	double userBalance = 0;
		if(customerAccountNumber.contains(accountNumber))
		{
			int index = customerAccountNumber.indexOf(accountNumber);
			userBalance = customerAccountBalance.get(index);
		}
		return userBalance;
	}

	public static double transferFunds(String accountNumber, String transferAmount, String secondAccountNumber)
	{
		int indexCustomer1 = customerAccountNumber.indexOf(accountNumber);
		int indexCustomer2 = customerAccountNumber.indexOf(secondAccountNumber);

		if (customerAccountNumber.contains(accountNumber))
		{
			customerAccountBalance.
		}
	}
}