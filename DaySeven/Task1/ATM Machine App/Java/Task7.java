import java.security.SecureRandom;
import java.util.*;

public class Task7 {
	public static void main(String[] args) {
		ArrayList<Object> customerData = new ArrayList<Object>();

		String message = """
				\n	Welcome to Semicolon Financial services.
				We would love to have you onbaord. Create an account to get started
				\n
				1 -> Create new account
				""";
		System.out.print(message);

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

		Scanner input = new Scanner(System.in);

		SecureRandom newUserAccountNumber = new SecureRandom();
		String userChoiceOfCreatingAnotherAccount = "";

		System.out.print("\nEnter an option: ");
		int userInput = input.nextInt();
		double accountBalance = 0.00;

		switch (userInput) {
			case 1:
				do {
					input.nextLine();
					System.out.print("\nWhat is your name?  ");
					String customerName = input.nextLine();
					customerData.add(customerName);

					long accountNumber = newUserAccountNumber.nextLong(1000000000, 1111111111);
					String accountNumberTostring = String.valueOf(accountNumber);
					customerData.add(accountNumberTostring);

					System.out.print("\nCreate a secret pin:  ");
					String customerPin = input.nextLine();
					customerData.add(customerPin);

					customerData.add(accountBalance);

					System.out.print("Do you want to create another account? ");
					userChoiceOfCreatingAnotherAccount = input.next();

				} while (userChoiceOfCreatingAnotherAccount.equalsIgnoreCase("yes"));

				System.out.println(
						"\nYour account was successfully created.\nYour new account number is " + customerData.get(1));
				System.out.println(
						"\nYou are required to fund your account within the next 24 hrs else, your account will be terminated.");
				input.nextLine();
				System.out.println("\nPress 0 to return to main menu or # to exit:");
				String userOptionToExitOrGoToMainMenu1 = input.nextLine();

				switch (userOptionToExitOrGoToMainMenu1) {
					case "0":
						System.out.println(message2);

						System.out.println("\nWhat will you like to do next? ");
						String usersOptionAfterCreatingAccount = input.nextLine();

						switch (usersOptionAfterCreatingAccount) {
							case "1":
								System.out.println("How much do you want to deposit? ");
								double depositAmount = input.nextDouble();
								accountBalance = Double.parseDouble(String.valueOf(customerData.get(3)));

								accountBalance = Accounts.deposit(depositAmount, accountBalance);
								customerData.set(3, accountBalance);
								System.out.println(
										"\nTransaction Successful\nYour new Balance is NGN" + customerData.get(3));
								break;
							case "2":
							default:
							

								System.out.println("\nEnter your account number to check your balance: ");
								String inputToCheckAccountBalance = input.nextLine();

								for (int i = 0; i < customerData.size(); i++) {
									if (customerData.get(i).equals(inputToCheckAccountBalance)) {

									System.out.println("\nYour account balance is NGN" + customerData.get(3));
									// System.out.println("WTF!!");
									}
								}
									
								System.out.println("\nPress 0 to return to main menu or # to exit:");
								String userOptionAfterCheckingAccountBalanceAndMakingDeposit = input.nextLine();

								switch(userOptionAfterCheckingAccountBalanceAndMakingDeposit){
									case "0":
									System.out.println(message3);
								}
								case "#":
								System.exit(0);
								// default:
								// System.out.print("Invalid input\nTry again");
						}	
				}

				
		}
	}
}