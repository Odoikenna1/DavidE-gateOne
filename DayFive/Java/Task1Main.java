import java.util.Scanner;

public class Task1Main
{
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);


		String message = """
		\nWelcome to Semicolon Fintech Solutions.
		You are reqired to enter in your valid
		Atm card number to complete any transaction.
		""";
		System.out.print(message);
		System.out.print("\nPlease enter your card digits: ");
		String userCardNumber = input.nextLine();		

		boolean result = Task1Function.validateAtmCardNumberByLength(userCardNumber);
		System.out.println(result);

		String cardStatus = Task1Function.checkIssuerOfAtmCard(userCardNumber);
		System.out.println(cardStatus);

		/*char displayNumberSeparatedWithHyphen = Task1Function.separateCreditCardNumberWithHyphen(userCardNumber);
		System.out.println(displayNumberSeparatedWithHyphen);*/
	}
}