
import java.util.Scanner;

public class CollectScoresAndFindSumPart3 {

	public static void main(String[] args) {

		int sum = 0;
		double average = 0;
		int i = 0;
		for (; i < 10; i++) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int userNumber = input.nextInt();

		sum += userNumber;
		
		}
		average = sum / i;
		System.out.printf("The sum of the user input is: %d%nThe average of the sum of the inputs: %.2f%n", sum, average);


	}
}