import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
	int[] arrayOfScores = new int[10];

	Scanner input = new Scanner(System.in);
	
	for (int counter = 0; counter < arrayOfScores.length; counter++)
	{
		System.out.print("Enter a score: ");
		arrayOfScores[counter] = input.nextInt();
	}
	System.out.print(Arrays.toString(arrayOfScores));
	}
}