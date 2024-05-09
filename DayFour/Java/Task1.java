/*
Objective, collect char inputs and map the inputs in specific 
slots in the 2-d array

you have a 3 by 3 2-d array

3 rows and 3 columns

ideally, every input would be assigned from the first row of the first column

but this time we need to explicitly ask the user where he wants each in put

we can start by mannually assigning each input to the specific row or column specified by the user using the indexes of the array
s
*/


import java.util.Arrays;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		String[][] ticTacToe = new String[3][3]; 

		String message = """
		\nWelcome to the tic-tac toe game.
		Please choose what position you would 
		like to play your character\n
		top left
		top center
		top right
		mid left
		mid center
		mid right
		buttom left
		buttom center
		buttom right
		""";

		System.out.print(message);

		boolean result;
		//0 means false, 1 means true
		int indexPositionTaken = 0;

		Scanner input = new Scanner(System.in);


		for (int index = 0; index < ticTacToe.length; index++)
		{
			for (int index2 = 0; index2 < ticTacToe[0].length; index2++)
			{
				System.out.println("\nPlay x or o:  ");
				String userInput = input.nextLine();

				System.out.println("What position would you like to place your character? ");
				String userPosition = input.nextLine();
				
				switch(userPosition) {
					case "top left":
						ticTacToe[0][0] = userInput;
					break;
					case "top center":
						ticTacToe[0][1] = userInput;
					break;
					case "top right":
						ticTacToe[0][2] = userInput;
					break;
					case "mid left":
						ticTacToe[1][0] = userInput;
					break;
					case "mid center":
						ticTacToe[1][1] = userInput;
					break;
					case "mid right":
						ticTacToe[1][2] = userInput;
					break;
					case "buttom left":
						ticTacToe[2][0] = userInput;
					break;
					case "buttom center":
						ticTacToe[2][1] = userInput;
					break;
					case "buttom right":
						ticTacToe[2][2] = userInput;
					break;
				}
			
			
			}
		}

		for (int index = 0; index < ticTacToe.length; index++)
		{
			for (int index2 = 0; index2 < ticTacToe[0].length; index2++)
			{
				System.out.printf("%s%5s", ticTacToe[index][index2], " ");
			}
		System.out.println();
		}
		


	}
}