const prompt = require("prompt-sync")();

let scores = [];
scores.length = 10;

for (let count = 0; count < scores.length; count++){
	user_input = parseInt(prompt("Enter a score: "));
	scores[count] = user_input;
}

console.log(scores);

