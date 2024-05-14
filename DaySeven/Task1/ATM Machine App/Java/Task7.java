import java.security.SecureRandom;
import java.util.*;
public class Task7
{
	public static void main(String[] args)
	{
		//ArrayList<ArrayList<Object>> customerData = new ArrayList<ArrayList<Object>>();

		Object[][] customerData = new Object[5][5];	

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

		SecureRandom newUserAccountNumber = new SecureRandom();
		String userChoiceOfCreatingAnotherAccount = "";

		System.out.print("\nEnter an option: ");
		int userInput= input.nextInt();
		int indexOfArrays = 0;
		int indexOfElementsInArray = 0;
		switch(userInput)
		{
			case 1:
				do {
				input.nextLine();
				System.out.print("\nWhat is your name?  ");
				String customerName = input.nextLine();
				customerData[indexOfArrays][indexOfElementsInArray] = customerName;

				long accountNumber = newUserAccountNumber.nextLong(1000000000, 1111111111);
				String accountNumberTostring = String.valueOf(accountNumber);
				customerData[indexOfArrays][indexOfElementsInArray] = accountNumberTostring;
		
				System.out.print("\nCreate a secret pin:  ");
				String customerPin = input.nextLine();
				customerData[indexOfArrays][indexOfElementsInArray] = customerPin;


				
				System.out.print("Do you want to create another account? ");
				userChoiceOfCreatingAnotherAccount = input.next();
				
				indexOfArrays++;
				indexOfElementsInArray++;

				} while (userChoiceOfCreatingAnotherAccount.equalsIgnoreCase("yes"));
				
				System.out.print("Your account was successfully created.\nYou are required to fund your account within the next 24 hrs else, your account will be terminated.");
			break;
		} 
		System.out.println("\nPress 0 to return to main menu or # to exit:");
		String userOptionToExitOrGoToMainMenu = input.nextLine();

	}
}

/*

What next?

Move the function to a method class.

it should take in a int input

return a String 
*/