import java.util.Scanner;
public class Task6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your date of birth: ");
		String userDob = input.nextLine();

		int userAge = Function.getAge(userDob);
		System.out.println("You are " + userAge + " years old.");

	}
}