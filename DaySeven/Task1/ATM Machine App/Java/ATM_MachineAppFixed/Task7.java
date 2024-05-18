import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String message = """
				\n	Welcome to Semicolon Financial services.
				We would love to have you onbaord. Create an account to get started
				\n
				1 -> Create new account
				""";

		String message2 = """
			\nWhat will you like to do next.

			1 -> Deposit funds	2 -> Check balance
			3 -> Withdraw funds	4 -> Transfer
			5 -> Close account
			""";
		String userChoiceToCreateAnotherAccount = "yes";
		String userInputForCase1 = "0";
		System.out.println(message);
		System.out.print( "\nEnter an option: ");
		String userInput = input.nextLine();

		switch (userInput) {
			
			case "1":		
			do{
			System.out.print("\nWhat is your name?  ");
			String customerName = input.nextLine();

			System.out.print("\nCreate a secret pin:  ");
			String customerPin = input.nextLine();

			String createAcoount = Accounts.createCustomerProfileAndPopulateDataBase(customerName, customerPin);
			System.out.println(createAcoount);

			System.out.println("\nDo you want to create another account?  ");
			userChoiceToCreateAnotherAccount = input.nextLine();
			}while(userChoiceToCreateAnotherAccount.equalsIgnoreCase("yes"));

			while(userInputForCase1.equalsIgnoreCase("0"))
			{
			System.out.println("\nPress 0 to view menu or # to exit program. ");
			userInputForCase1 = input.nextLine();
			
				switch(userInputForCase1){
						case "0":
							System.out.println(message2);
							System.out.print( "\nEnter an option: ");
							String userInput2 = input.nextLine();

							switch(userInput2){
								case "1":
									System.out.print("\nHow much will you like to deposit?  ");
									double creditAmount = input.nextDouble();
									input.nextLine();
									System.out.print("\nWhat is your account number?  ");
									String userAccountNumber = input.nextLine();
									System.out.print("\nEnter your pin to complete this transaction:  ");
									String pin = input.nextLine();
									double newBalance = Accounts.depositFunds(userAccountNumber, creditAmount, pin);
									System.out.println("\nTransaction succsesful\nYour new balance is NGN" + newBalance);
									break;
								case "2":
									System.out.println("\nEnter your account number: ");
									userAccountNumber = input.nextLine();
									double customerAccountBalance = Accounts.checkBalance(userAccountNumber);
									System.out.println("Your account balance is NGN" + customerAccountBalance);
									break;
								case "3":
									System.out.println("How much do you want to withdraw? ");
									double userwithdrawAmount = input.nextDouble();
									input.nextLine();
									System.out.println("Enter your account number in order to make a withdraw:  ");
									userAccountNumber = input.nextLine();
									System.out.println("Enter your pin to complete this transaction:  ");
									String userPin = input.nextLine();
									String transactionStatus = Accounts.withdraw(userAccountNumber, userwithdrawAmount, userPin);
									System.out.println(transactionStatus);
									break;
								case "4":
									System.out.print("How much do you want to transfer? ");
									double userWithdrawAmount = input.nextDouble();
									input.nextLine();
									System.out.print("Enter your account number:  ");
									String debtorAccountNumber = input.nextLine();
									System.out.print("Enter the account number of the receiver:  ");
									String creditorAccountNumber= input.nextLine();
									String transactionReport = Accounts.transferFunds(debtorAccountNumber, userWithdrawAmount, creditorAccountNumber);
									System.out.print(transactionReport);
									break;
								case "5":
									System.out.print("Your account number is required to close your account: ");
									String usersAccountNumber = input.nextLine();
									String accountStatus = Accounts.removeAccount(usersAccountNumber);
									System.out.println(accountStatus);
									break;
								case "#":
									System.exit(0);
								default:
								System.out.println("Invalid input\tTry again.");
							}
				}
				
			}
			
		}
	}
}