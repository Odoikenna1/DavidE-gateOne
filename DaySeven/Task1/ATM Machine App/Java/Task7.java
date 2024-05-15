import java.security.SecureRandom;
import java.util.*;

public class Task7 {
	public static void main(String[] args) {
		ArrayList<Object> customerData = new ArrayList<Object>();

		String message = """
				\nWelcome to Semicolon ATM services.
				What would you like to do today?
				\n
				1 -> Create new account     2 -> Check balance
				3 -> Deposit money	    4 -> Withdraw funds
				5 -> Transfer		    6 -> Close account

				""";
		System.out.print(message);

		String message2 = """
				\nNow your account has been created, try doing something else.

				1 -> Deposit money	2 -> Check balance
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

				System.out.println("\nYour account was successfully created.\nYour new account number is " + customerData.get(1));
				System.out.println("\nYou are required to fund your account within the next 24 hrs else, your account will be terminated.");
				input.nextLine();
				System.out.println("\nPress 0 to return to main menu or # to exit:");
				String userOptionToExitOrGoToMainMenu = input.nextLine();

				switch (userOptionToExitOrGoToMainMenu) {
					case "0":
						System.out.println(message2);
						
						System.out.println("\nWhat will you like to do next? ");
						String usersOption = input.nextLine();

						switch (usersOption) {
							case "1":
							System.out.println("How much do you want to deposit? ");
							double depositAmount = input.nextDouble();
							accountBalance = Double.parseDouble((String) customerData.get(3));

							/*double balanceUpdated = Accounts.deposit(depositAmount, accountBalance);
							customerData.set(3, balanceUpdated);
							System.out.println(customerData.get(3));
							default:*/
							System.out.println("Invalid input");
						}
							
				System.out.println("\nPress 0 to return to main menu or # to exit:");
				String userOptionToExitOrGoToMainMenu2 = input.next();

				System.out.print(message2);

				switch (userOptionToExitOrGoToMainMenu2) {
					case "2":
					input.nextLine();
					System.out.println("Enter your account number to check your balance: ");
					String inputToCheckAccountBalance = input.nextLine();

					for (int i = 0; i < customerData.size(); i++) {
						if (customerData.get(i).equals(inputToCheckAccountBalance)) {

							System.out.println("\nYour account balance is " + customerData.get(3));
							break;
						}
					}			
					System.out.println("\nPress 0 to return to main menu or # to exit:");
					userOptionToExitOrGoToMainMenu2 = input.next();
						
					case "#":
						System.exit(0);
						default:
						System.out.print("Invalid input\nTry again");
						
				}

		}
			break;					
			case 2:
				System.out.println("\nYou need to have an account with us, please create an account.");
				System.out.println();
				System.out.println("\nPress 0 to return to main menu or # to exit:");
				int userOptionToExitOrGoToMainMenuforcase2 = input.nextInt();

				switch (userOptionToExitOrGoToMainMenuforcase2) {

					case 0:
						System.out.println(message);
						System.out.println("\nPress 1 to create an account? ");
						String usersOption = input.nextLine();

						switch (usersOption) {
							case "1":
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

									System.out.print("Do you want to create another account? ");
									userChoiceOfCreatingAnotherAccount = input.next();

								} while (userChoiceOfCreatingAnotherAccount.equalsIgnoreCase("yes"));

								System.out
										.println("\nYour account was successfully created.\nYour new account number is "
												+ customerData.get(1));
								System.out.println(
										"\nYou are required to fund your account within the next 24 hrs else, your account will be terminated.");

								System.out.println("\nPress 0 to return to main menu or # to exit:");
								String userOptionToExitOrGoToMainMenu3 = input.nextLine();

								switch (userOptionToExitOrGoToMainMenu3) {
									case "0":
										System.out.println(message);
										System.out.println("\nWhat will you like to do next? ");
										usersOption = input.next();

										switch (usersOption) {
											case "1":
												System.out.println(
														"You are not serious, I thought you just did this.\nRestart the program if you really wan to do this again.");
											case "2":
												System.out.println("Your account balance is: " + customerData.get(1));
										}
									case "#":
										System.exit(0);
								}

						}
				}
		}
	}
}