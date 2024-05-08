import java.util.Scanner;

public class CollectScoresAndFindSumPart8 {

	public static void main(String[] args) {

		int sum = 0;
		double average = 0;
		int i = 0;
		for (; i < 10; i++) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int scores = input.nextInt();
		
			if (scores < 0) {
				
				System.out.print("\nInvalid input\nTry again.\n");
				i-=1;
				//continue;
			} 
			if (scores > 100) {
				System.out.print("\nInvalid input\nTry again.\n");
				i-=1;
			}

			else {
				sum += scores;
			}
		}
		//average = sum / i;

		System.out.printf("%nThe sum of valid scores entered is: %d%n", sum);


	}
}

