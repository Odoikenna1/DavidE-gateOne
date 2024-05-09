const prompt = require("prompt-sync")();

let ticTacToeBoard = [[],[]];
ticTacToeBoard.lenght = 3;


let message = `
\nWelcome to the tic-tac toe game
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
`;

console.log(ticTacToeBoard);

for (let index = 0; index < ticTacToeBoard.length; index++)
{
	for (let index2 = 0; index2 < ticTacToeBoard[0].length; index2++)
	{
		let user_input = prompt("\nPlay x or o: ");

		let user_options = prompt("What position would you like to place your character? ");

		switch(user_options) {
			case "top left":
				ticTacToeBoard[0][0] = user_input;
			break;
			case "top center":
				ticTacToeBoard[0][1] = user_input;
			break;
			case "top right":
				ticTacToeBoard[0][2] = user_input;
			break;
			case "mid left":
				ticTacToeBoard[1][0] = user_input;
			break;
			case "mid center":
				ticTacToeBoard[1][1] = user_input;
			break;
			case "mid right":
				ticTacToeBoard[1][2] = user_input;
			break;
			case "buttom left":
				ticTacToeBoard[2][0] = user_input;
			break;
			case "buttom center":
				ticTacToeBoard[2][1] = user_input;
			break;
			case "buttom right":
				ticTacToeBoard[2][2] = user_input;
			break;
		}

	}
}

for (let index = 0; index < ticTacToeBoard.length; index++)
{
	for (let index2 = 0; index2 < ticTacToeBoard[0].length; index2++)
	{
		console.log(ticTacToeBoard[index][index2] + " ");
	}
	console.log();
}