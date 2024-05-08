import java.util.Scanner;

public class CollectScoresAndFindSumPart7 {

	public static void main(String[] args) {

		int sum = 0;
		double average = 0;
		int counterForEvenNumbersEntered = 0;
		int i = 0;
		for (; i < 10; i++) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int userNumber = input.nextInt();
		
			if (userNumber % 2 == 0) {
				sum += userNumber;
				counterForEvenNumbersEntered++;
			}
		
		}
		average = sum / counterForEvenNumbersEntered;

		System.out.printf("The sum of the even numbers entered by the user is: %d%nThe average of the sum of the even number inputs is: %.2f%n", sum, average);


	}
}

