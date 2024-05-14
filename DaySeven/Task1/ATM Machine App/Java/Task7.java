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

		int accountCreated = Functions.createAccount(userOption);

		System.out.print(accountCreated);
	}
}