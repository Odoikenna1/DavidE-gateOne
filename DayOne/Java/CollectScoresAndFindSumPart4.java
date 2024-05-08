/*My sincere apologies, I wasn't sure exactly what the expected implimentation of this code is , so based on my understandingI did it in 2 ways*/

/*
import java.util.Scanner;

public class CollectScoresAndFindSumPart4 {

	public static void main(String[] args) {

		int sum = 0;
		double average = 0;
		int i = 0;
		for (; i < 10; i+=2) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int userNumber = input.nextInt();

		sum += userNumber;
		
		}
		average = sum / i;
		System.out.printf("The sum of the inputs at even indexes is: %d%n", sum);


	}
}*/




import java.util.Scanner;

public class CollectScoresAndFindSumPart4 {

	public static void main(String[] args) {

		int sum = 0;
		double average = 0;
		int i = 0;
		for (; i < 10; i++) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int userNumber = input.nextInt();
		
			if (i % 2 == 0) {
				sum += userNumber;
			System.out.printf("%nHere are the inputs at even indexes for conformation %d%n", i);
			}
		
		}
		average = sum / i;

		System.out.printf("%nThe sum of the inputs at even indexes is: %d%n", sum);


	}
}

