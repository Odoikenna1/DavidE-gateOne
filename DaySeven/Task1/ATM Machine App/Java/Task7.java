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
			//String userFlagInput = input.nextLine();
			userInput = input.nextInt();
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
			String transactionStatus = Accounts.withdraw(userAccountNumber, userwithdrawAmount, userPin);
			System.out.println(transactionStatus);

			case 5:
			System.out.print("How much do you want to transfer? ");
			double userWithdrawAmount = input.nextDouble();
			System.out.print("Enter your account number:  ");
			String debtorAccountNumber = input.nextLine();
			System.out.print("Enter the account number of the receiver:  ");
			String creditorAccountNumber= input.nextLine();
			String transactionReport = Accounts.transferFunds(debtorAccountNumber, userWithdrawAmount, creditorAccountNumber);
			System.out.print(transactionReport);
			
			case 6:
			System.out.print("Your account number is requires to close your account: ");
			String usersAccountNumber = input.nextLine();
			String accountStatus = Accounts.deactivateAccount(usersAccountNumber);
			System.out.println(accountStatus);
		}
	}
}