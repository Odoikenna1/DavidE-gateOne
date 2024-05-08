import java.util.Scanner;

public class CollectScoresAndFindSumPart10 {

	public static void main(String[] args) {

		int sum = 0;
		double average = 0;
		int i = 0;
		int validScoreCounter = 0;
		for (; i < 10; i++) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int scores = input.nextInt();
		
			if (scores < 0) {
			
				continue;
			} 
			
			if (scores > 100) {
				continue;
			} else {
				sum += scores;
				validScoreCounter++;
			}
			
			
		}
		average = sum / validScoreCounter;

		System.out.printf("%nThe sum of valid scores entered is: %d%nThe average of the valid scores from task 9 is: %.2f%n", sum, average);


	}
}

