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

	public static String createCustomerProfileAndPopulateDataBase(String userName, String pin)
	{
		customerName.add(userName);
		long accountNumber = newUserAccountNumber.nextLong(1000000000, 1111111111); 
		String accountNumberTostring = String.valueOf(accountNumber);
		customerAccountNumber.add(accountNumberTostring);
		customerPin.add(pin);
		customerAccountBalance.add(accountBalance);
		return "Your account has been created successfully.\nYour account number is " + accountNumberTostring;
	}


	public static double depositFunds(String accountNumberTostring, double depositAmount, String pin)
	{	int index = 0;
		if(customerAccountNumber.contains(accountNumberTostring))
		{
		 index = customerAccountNumber.indexOf(accountNumberTostring);
		accountBalance = customerAccountBalance.get(index);
			if(customerPin.get(index).equals(pin))
			{
			accountBalance = accountBalance + depositAmount;
			customerAccountBalance.set(index, accountBalance);
			}
		}
		return customerAccountBalance.get(index);
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

	public static String transferFunds(String accountNumber, double transferAmount, String secondAccountNumber)
	{
		int indexCustomer1 = customerAccountNumber.indexOf(accountNumber);
		int indexCustomer2 = customerAccountNumber.indexOf(secondAccountNumber);
		double accountBalanceForCustomer1 = 0;
		double accountBalanceForCustomer2 = 0;
		if (customerAccountNumber.contains(accountNumber))
		{
			accountBalanceForCustomer1 = customerAccountBalance.get(indexCustomer1);
			accountBalanceForCustomer2 = customerAccountBalance.get(indexCustomer2);

			if (transferAmount < accountBalanceForCustomer1){

				accountBalanceForCustomer1 = accountBalanceForCustomer1 - transferAmount;
				customerAccountBalance.set(indexCustomer1, accountBalanceForCustomer1);
				double fundsRemovedFromCustomer1 = accountBalanceForCustomer1;
				accountBalanceForCustomer2 = fundsRemovedFromCustomer1 + accountBalanceForCustomer2;
				customerAccountBalance.set(indexCustomer2, accountBalanceForCustomer2);

			} else{

				return "Insufficient funds.";
			}
			
		} return "Transaction Successful.";
	
	}
}