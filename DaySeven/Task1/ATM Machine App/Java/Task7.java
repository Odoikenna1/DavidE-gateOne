import java.security.SecureRandom;
import java.util.*;
public class Task7
{
	public static void main(String[] args)
	{
		ArrayList<ArrayList<Object>> customerData = new ArrayList<ArrayList<Object>>();

		//Object[][] customerData = new Object[5][5];	
	
		String message = """
		\nWelcome to Semicolon ATM services.
		What would you like to do today?
		\n
		1 -> Create new account     2 -> Check balance
		3 -> Deposit money	    4 -> Withdraw funds
		5 -> Transfer		    6 -> Retrieve accout number
		""";
		System.out.print(message);

		Scanner input = new Scanner(System.in);

		SecureRandom newUserAccountNumber = new SecureRandom();
		String userChoiceOfCreatingAnotherAccount = "";

		System.out.print("\nEnter an option: ");
		int userInput= input.nextInt();
		int indexOfArrays = 0;
		int indexOfElementsInArray = 0;
		double accountBalance = 0.00;


		switch(userInput)
		{
			case 1:
				do {
				input.nextLine();
				System.out.print("\nWhat is your name?  ");
				String customerName = input.nextLine();
				customerData.set() = customerName;

				long accountNumber = newUserAccountNumber.nextLong(1000000000, 1111111111);
				String accountNumberTostring = String.valueOf(accountNumber);
				customerData[0][1] = accountNumberTostring;

				 customerData[0][2] = accountBalance;
		
				System.out.print("\nCreate a secret pin:  ");
				String customerPin = input.nextLine();
				customerData[0][3] = customerPin;
				
				System.out.print("Do you want to create another account? ");
				userChoiceOfCreatingAnotherAccount = input.next();
				
				indexOfArrays++;
				indexOfElementsInArray++;

				} while (userChoiceOfCreatingAnotherAccount.equalsIgnoreCase("yes"));
				
				System.out.println("\nYour account was successfully created.\nYou are required to fund your account within the next 24 hrs else, your account will be terminated.");

				System.out.println("\nPress 0 to return to main menu or # to exit:");
				String userOptionToExitOrGoToMainMenu = input.next();

					switch(userOptionToExitOrGoToMainMenu)
					{
						case "0":
							System.out.println(message);
							System.out.println("\nWhat will you like to do next? ");
							String usersOption = input.next();
						
							switch(usersOption)
							{
								case "1":
									System.out.println("You are not serious, I thought you just did this.\nRestart the program if you really wan to do this again.");
								case "2":
									System.out.println("Your account balance is: " + customerData[0][2]);
							}
						case "#":
							System.exit(0);
					}

			case 2:
				System.out.println("Your account balance is: " + customerData[0][2] + "\nYou do not have an account with us, please create an account.");
				System.out.println();
				System.out.println("\nPress 0 to return to main menu or # to exit:");
				 userOptionToExitOrGoToMainMenu = input.next();
				
					switch(userOptionToExitOrGoToMainMenu){

						case "0":
							System.out.println(message);
							System.out.println("\nPress 1 to create an account? ");
							String usersOption = input.next();
							
							switch(usersOption)
							{
								case "1":
									do {
									input.nextLine();
									System.out.print("\nWhat is your name?  ");
									String customerName = input.nextLine();
									customerData[0][0] = customerName;

									long accountNumber = newUserAccountNumber.nextLong(1000000000, 1111111111);
									String accountNumberTostring = String.valueOf(accountNumber);
									customerData[0][1] = accountNumberTostring;

									customerData[0][2] = accountBalance;
		
									System.out.print("\nCreate a secret pin:  ");
									String customerPin = input.nextLine();
									customerData[0][3] = customerPin;
				
									System.out.print("Do you want to create another account? ");
									userChoiceOfCreatingAnotherAccount = input.next();
				
									indexOfArrays++;
									indexOfElementsInArray++;

									} while (userChoiceOfCreatingAnotherAccount.equalsIgnoreCase("yes"));
				
									System.out.println("\nYour account was successfully created.\nYou are required to fund your account within the next 24 hrs else, your account will be terminated.");

									System.out.println("\nPress 0 to return to main menu or # to exit:");
									userOptionToExitOrGoToMainMenu = input.next();

									switch(userOptionToExitOrGoToMainMenu)
									{
										case "0":
											System.out.println(message);
											System.out.println("\nWhat will you like to do next? ");
											usersOption = input.next();
						
											switch(usersOption)
											{
												case "1":
													System.out.println("You are not serious, I thought you just did this.\nRestart the program if you really wan to do this again.");
												case "2":
													System.out.println("Your account balance is: " + customerData[0][2]);
											}
										case "#":
											System.exit(0);
											}

							}
				}
		}
	}
}

/*

What next?

Move the function to a method class.

it should take in a int input

return a String 
*/