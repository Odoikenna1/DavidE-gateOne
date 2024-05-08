
import java.util.Scanner;

public class CollectScoresAndFindSum {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i < 10; i++) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int userNumber = input.nextInt();

		sum += userNumber;
		}

		System.out.print(sum);


	}
}