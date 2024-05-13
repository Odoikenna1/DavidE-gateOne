
import java.util.*;

public class Task7
{
	public static void main(String[] args)
	{

		//ArrayList<ArrayList<Object>> customerData = new ArrayList<ArrayList<Object>>();

		String message = """
		\nWelcome to Semicolon ATM services.
		What would you like to do today?
		\n
		1 -> Create New Account     2 -> Check Balance
		3 -> Deposit Money	    4 -> Withdraw Funds
		5 -> Transfer
		""";

		Object[][] customerData = new Object [2][3];	//2 columns; 1 for account number and balance

		/*
		customerData[0][0] first array row is for customer name
		customerData[1][0] first array row is for account number
		customerData[2][0] first array row is for account balance
		*/
		
		int rows = customerData.length;
		int columns = customerData[0].length;
		
		double availableBalance = 0.00;
		double ledgerBalance = 0.00;

		System.out.print(message);

		Random variantAccountNumber = new Random();
		long newUserAccountNumber = Math.abs(variantAccountNumber.nextLong());
		
		System.out.println(newUserAccountNumber);

		Scanner input = new Scanner(System.in);
	
		System.out.print("\nEnter an option: ");
		int userOption = input.nextInt();
		
		switch(userOption)
		{
			case 1:
				String createAccountOptions = """
				\nWe need the following details to create your new account.
				""";
				input.nextLine();
				System.out.print(createAccountOptions + "\nWhat is your name?  ");
				String customerName = input.nextLine();
				customerData[0][0] = customerName;
				customerData[1][0] = newUserAccountNumber;
			break;
			case 2:
				System.out.print("Enter your account number: ");
				System.out.print("Available Balance: " + availableBalance);
				System.out.print("Ledger Balance: " + availableBalance);
			break;
		}
		System.out.println();
		System.out.printf("%8s Account number %8s Accountbalance%n%n", "","");
		System.out.printf("%s%8s%.2f%8s%s%n", customerData[0][0], "", availableBalance, "", customerData[1][0]);






	}
}