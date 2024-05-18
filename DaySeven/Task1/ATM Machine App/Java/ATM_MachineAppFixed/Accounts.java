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
		long accountNumber = newUserAccountNumber.nextLong(1_000_000_000, 1_111_111_111); 
		String accountNumberTostring = String.valueOf(accountNumber);
		customerAccountNumber.add(accountNumberTostring);
		customerPin.add(pin);
		customerAccountBalance.add(accountBalance);
		return "\nYour account has been created successfully.\nYour account number is " + accountNumberTostring;
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

	public static String withdraw(String accountNumberTostring, double withdrawAmount, String pin)
	{
		String updatedBalance = "";
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
						customerAccountBalance.set(index, accountBalance);
						updatedBalance = String.valueOf(accountBalance);
						return "\nTransaction successful\nYour new balance is NGN" + updatedBalance;
					}
				}
		}return updatedBalance;	
	}

	public static double checkBalance(String accountNumber)
	{	
		if(customerAccountNumber.contains(accountNumber))
		{
			int index = customerAccountNumber.indexOf(accountNumber);
			accountBalance = customerAccountBalance.get(index);
		}	
		else {
			System.out.println("\nInvalid account number.\nNo account with this number was found.");
		}
		return accountBalance;		
	}

	public static String transferFunds(String senderAccountNumber, double transferAmount, String receiverAccountNumber)
	{
		int indexCustomer1 = customerAccountNumber.indexOf(senderAccountNumber);
		int indexCustomer2 = customerAccountNumber.indexOf(receiverAccountNumber);
		double accountBalanceForCustomer1 = 0;
		double accountBalanceForCustomer2 = 0;
		String tempBalanceForCustomer1Tostring = "";
		if (customerAccountNumber.contains(senderAccountNumber))
		{
			accountBalanceForCustomer1 = customerAccountBalance.get(indexCustomer1);
			accountBalanceForCustomer2 = customerAccountBalance.get(indexCustomer2);

			if (transferAmount < accountBalanceForCustomer1){

				accountBalanceForCustomer1 = accountBalanceForCustomer1 - transferAmount;
				double tempBalanceForCustomer1 = accountBalanceForCustomer1;
				tempBalanceForCustomer1Tostring = String.valueOf(tempBalanceForCustomer1);
				customerAccountBalance.set(indexCustomer1, accountBalanceForCustomer1);
				accountBalanceForCustomer2 = accountBalanceForCustomer2 + transferAmount;
				customerAccountBalance.set(indexCustomer2, accountBalanceForCustomer2);

			} else{

				return "\nInsufficient funds.";
			}		
		} return "\nTransaction Successful.\n Your new balance is " + tempBalanceForCustomer1Tostring;
	
	}

	public static String removeAccount(String customersAccountNumber)
		{
			if(customersAccountNumber.contains(customersAccountNumber))
			{
				int index = customersAccountNumber.indexOf(customersAccountNumber);
				customerName.remove(index);
				customerAccountBalance.remove(index);
				customerPin.remove(index);
			}
			return "\nYour account has been removed.";
		}
}