const prompt = require("prompt-sync")();

let min = 1;
let max = 20;
let gameRunTime = 10;
let correctNumber = 0;
let incorrectNumber = 0;

console.log("Welcome to the arithmetic game\nPlease provide the anser to the following\n");

for (let count = 5; count < gameRunTime; count++)
{
	let randomNumber1 = Math.floor(Math.random() * (10-1) +1);
	let randomNumber2 = Math.floor(Math.random() * (20-1) +1);

	let user_input = parseInt(prompt(`${randomNumber1} + ${randomNumber2} = `))
	if (user_input == randomNumber1 + randomNumber2)
	{
		correctNumber+=1;
	} else {
		incorrectNumber+=1;
	}
}
console.log('Game Over\nYour got ${correctNumber} correct\nYou got ${incorrectNumber} incorrect');