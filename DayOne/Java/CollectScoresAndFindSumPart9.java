import java.util.Scanner;

public class CollectScoresAndFindSumPart9 {

	public static void main(String[] args) {

		int sum = 0;
		double average = 0;
		int i = 0;
	
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
			}
			
			
		}
		//average = sum / i;

		System.out.printf("%nThe sum of valid scores entered is: %d%n", sum);


	}
}

