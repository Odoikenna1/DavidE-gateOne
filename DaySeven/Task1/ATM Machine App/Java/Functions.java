import java.security.SecureRandom;
import java.util.*;
public class Functions
{
	public static int createAccount(int menuInput)
	{
		Scanner input = new Scanner(System.in);

		Object[][] customerData = new Object [4][3];
		double availableBalance = 0.00;

		SecureRandom newUserAccountNumber = new SecureRandom();

		long accountNumber = newUserAccountNumber.nextLong(1000000000, 1111111111);
		

		int rows = customerData.length;
		int columns = customerData[0].length;
		

		double ledgerBalance = 0.00;

		switch(menuInput)
		{
			case 1:
				//input.nextLine();
				System.out.print("\nWhat is your name?  ");
				String customerName = input.nextLine();
				customerData[0][0] = customerName;
				customerData[0][1] = accountNumber;
				customerData[0][2] = availableBalance;
				System.out.println("\nYour account was successfully created.\nYour account number is " + customerData[0][1]);
				System.out.print("\nYou are required to fund your account within the next 24hrs, or risk termination of your account.\nTo Fund your account now, select the deposit money option in the main menu.\n");

				System.out.println("\nPress 0 to return to main menu or # to exit: \n");
				String userInputForExitOrReturn = input.nextLine();
			break;
			default:
				System.out.println("Invalid input\nTry again.");
		}
		System.out.println();
		System.out.printf("%n%8s Account number %6s Account balance%n%n", "","");
		return "your accot "customerData[1][0];
	} 
}