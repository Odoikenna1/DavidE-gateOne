import java.util.*;

public class Task7
{
	public static void main(String[] args)
	{

		String message = """
		\nWelcome to Semicolon ATM services.
		What would you like to do today?
		\n
		1 -> Create New Account     2 -> Check Balance
		3 -> Deposit Money	    4 -> Withdraw Funds
		5 -> Transfer
		""";

		Object[][] customerData = {
			{null, null, null}, //customer names
			{500, 850, 340} //account balance
		};
		
		int rows = customerData.length;
		int columns = customerData[0].length;
		
		double accountBalance = 0.00;

		System.out.print(message);

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
			break;
		}
		System.out.println();
		System.out.printf("%8s Account balance%.2f%n", "", accountBalance, "");
		System.out.println(customerData[0][0]);






	}
}