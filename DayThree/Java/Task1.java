import java.util.Scanner;
import java.util.Random;

public class ArithmeticGame
{
	public static void main(String[] args)
	{
		int numberOfTimeGameIsRunning = 10;
		int correctAnswers = 0;
		int incorrectAnswers = 0;

		Random randomNumbers = new Random();
		
		Scanner input = new Scanner(System.in);
		

		System.out.println("\nWelcome to the arithmetic game.\nYour scores will be displayed at the end of the program.\n\nWhat is the answer to the following questions?");

		for (int counter = 0; counter < numberOfTimeGameIsRunning; counter++)
		{

			int number1 = randomNumbers.nextInt(1, 10);
			int number2 = randomNumbers.nextInt(1, 10);

			System.out.printf("%d + %d = ", number1, number2);
			int userInput = input.nextInt();
			
			if (userInput == number1 + number2)
			{

				correctAnswers++;
			} else {
				
				incorrectAnswers++;
			}
		}

		System.out.printf("%nGame Over%nYour got %d correct%nYou got %d incorrect %n", correctAnswers, incorrectAnswers);
		


	}

}