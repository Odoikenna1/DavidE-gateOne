import java.security.SecureRandom;
import java.util.*;
public class Functions
{
	public static void populateDataBaseWithUserName(int userInput)
	{
		Scanner input = new Scanner(System.in);


		
		if(userInput == 1)
		{
			System.out.print("\nWhat is your name?  ");
			String customerName = input.nextLine();
			customerData[0][0] = customerName;
				
			System.out.print("\nCreate a secret pin:  ");
			String customerSecretPin = input.nextLine();
			customerData[0][3] = customerSecretPin;		
		}
		
	} 
}

/*

collect user name
	- populate array database

generate random account number
	- populate array database


		String userPinTostring = "";
*/