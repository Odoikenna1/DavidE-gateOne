import java.net.SocketTimeoutException;
import java.security.SecureRandom;
import java.util.*;

public class Task7 {
	public static void main(String[] args) {
		ArrayList<Object> customerData = new ArrayList<Object>();
		Scanner input = new Scanner(System.in);

		String message = """
				\n	Welcome to Semicolon Financial services.
				We would love to have you onbaord. Create an account to get started
				\n
				1 -> Create new account
				""";

		String message2 = """
				\nNow that your account has been created, try initiating a transaction.

				1 -> Deposit funds	2 -> Check balance
				3 -> Withdraw funds	4 -> Transfer
				5 -> Close account
				""";

		String message3 = """
			\nWhat will you like to do  next.

			1 -> Deposit funds	2 -> Check balance
			3 -> Withdraw funds	4 -> Transfer
			5 -> Close account
			""";

		System.out.println(message);
		System.out.print( "\nEnter an option: ");
		int userInput = input.nextInt();

		double accountBalance = 0.00;

		boolean programIsActive = true;


		while(programIsActive)
		{
		switch (userInput) {
			case 1:
			input.nextLine();
			System.out.print("\nWhat is your name?  ");
			String customerName = input.nextLine();

			System.out.print("\nCreate a secret pin:  ");
			String customerPin = input.nextLine();

			String createAcoount = Accounts.createCustomerProfileAndPopulateDataBase(customerName, customerPin);
			System.out.println(createAcoount);

			System.out.println("\nPress 0 to view op the program ");
			String userFlagInput = input.nextLine();

			break;

			
			case 2:

			System.out.print("\nWhat is your account number?  ");
			String depositAmount = input.nextLine();

			System.out.print("\nHow much will you like to deposit?  ");
			double creditAmount = input.nextDouble();

			input.nextLine();
			System.out.print("\nEnter your pin to complete this transaction:  ");
			String pin = input.nextLine();

			double newBalance = Accounts.depositFunds(depositAmount, creditAmount, pin);
			System.out.print("\nTransaction succsesful\nYour new balance is NGN" + newBalance);
			
			case 3:
			System.out.println("\nEnter your account number: ");
			String userAccountNumber = input.nextLine();
			double customerAccountBalance = Accounts.checkBalance(userAccountNumber);
			System.out.println("Your account balance is " + customerAccountBalance);

			case 4:
			System.out.println("How much do you want to withdraw");
			double userwithdrawAmount = input.nextDouble();
			input.nextLine();
			System.out.println("Enter your account number in orde to make a withdraw:  ");
			userAccountNumber = input.nextLine();
			System.out.println("Enter your pin to complete this transaction:  ");
			String userPin = input.nextLine();
			withdraw(userwithdrawAmount, userAccountNumber, userPin);
		}
		}
	}
}