/*
write a function to validate an ATM card number.

Requirements:

The function should take a string representing the card number
	in other words collect numbers as a string

step 1 create a class and a method header respresting the values
you are working with

Return a boolean value (true) if the card number is valid
and false if otherwise

Below are the requirments that a valid card must satisfy
	must contain exactly 16 digits
	must start with a '4', '5', or '6'
	it must have digits in groups of 4, separated by a hyphen('-')
	it must not have any other character besides digits and hyphens.
*/

public class Task1Function 
{
	public static boolean validateAtmCardNumberByLength(String cardNumber)
	{

		int defaultLength = 16;
		int cardNumberLength = cardNumber.length();

		if (cardNumberLength == defaultLength) return true;
		else {return false;}
		
	} 


	public static String checkIssuerOfAtmCard(String cardNumber)
	{
		char Visa = '4';
		char MasterCard = '5';
		char Discover = '6';

		char valueOfCharFirstIndex = cardNumber.charAt(0);

		if (valueOfCharFirstIndex == Visa) return "This is a Visa.";
		else if (valueOfCharFirstIndex == MasterCard) return "This is a MasterCard.";
		else if (valueOfCharFirstIndex == Discover) return "This is a Discover card.";
		else {return "Not a valid card.";}
	} 

	/*public static char separateCreditCardNumberWithHyphen(String cardNumber)
	{
		//char separator = '-';
		char cardNumberSeprated = '-';
	
		for (int i = 0; i < cardNumber.length(); i++)
		{
			cardNumberSeprated = (char)cardNumber.charAt(i);
			cardNumberSeprated = (char)cardNumberSeprated + '-';
			System.out.println(cardNumberSeprated);
		} 
		return cardNumberSeprated;
		
	} */
}
/*
What do you want to do?
I want 

'-'

if there a 
*/