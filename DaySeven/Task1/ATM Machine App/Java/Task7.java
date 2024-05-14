import java.security.SecureRandom;
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

		System.out.print(message);

		Scanner input = new Scanner(System.in);
	
		System.out.print("\nEnter an option: ");
		int userOption = input.nextInt();

		Object[][] customerData = new Object [6][5];
		double availableBalance = 0.00;

		SecureRandom newUserAccountNumber = new SecureRandom();

		long accountNumber = newUserAccountNumber.nextLong(1000000000, 1111111111);
		
		String accountNumberTostring = String.valueOf(accountNumber);
		String userPinTostring = "";

		int rows = customerData.length;
		int columns = customerData[0].length;
		

		double ledgerBalance = 0.00;

		switch(userOption)
		{
			case 1:
				input.nextLine();
				System.out.print("\nWhat is your name?  ");
				String customerName = input.nextLine();
				System.out.print("\nCreate a secret pin:  ");
				String customerSecretPin = input.nextLine();
				customerData[0][0] = customerName;
				customerData[0][1] = accountNumberTostring;
				customerData[0][2] = availableBalance;
				customerData[0][3] = customerSecretPin;
				System.out.print(customerData[0][3]);
				System.out.println("\nYour account was successfully created.\nYour account number is " + customerData[0][1]);
				System.out.print("\nYou are required to fund your account within the next 24hrs, or risk termination of your account.\nTo Fund your account now, select the deposit money option in the main menu.\n");

				System.out.println("\nPress 0 to return to main menu or # to exit: \n");
				String userInputForExitOrReturn = input.nextLine();
				
				switch(userInputForExitOrReturn)
				{
					case "0":
						System.out.print(message);
					case "#":
						System.exit(0);
				}
			break;
			default:
				System.out.println("Invalid input\nTry again.");
		}
		System.out.println();
		/*System.out.printf("%n%8s Account number %6s Account balance %6s Pin%n%n", "","","");
		System.out.printf("%s %5s %s %13s %s %13s %s",customerData[0][0], "", customerData[0][1], "", customerData[0][2], "", customerData[0][3]);
		System.out.println();*/
	}
}