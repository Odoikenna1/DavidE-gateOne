const prompt = require("prompt-sync")();

let message1 = `
\nWelcome to Semicolon Financial services.
We would love to have you onbaord. Create an account to get started
\n
1 -> Create new account
`;

message2 = `
\nWhat will you like to do next.

1 -> Deposit funds	2 -> Check balance
3 -> Withdraw funds	4 -> Transfer
5 -> Close account
`;

let user_account_number;
let user_pin_number;
let userChoiceToCreateAnotherAccount = "yes";
let userInputForCase1 = "0";

console.log(message1);
let userInput = prompt("\nEnter an option: ");

switch (userInput){
	case "1":		
		do{
			let customerName = prompt("\nWhat is your name?  ");

			let customerPin = prompt("\nCreate a secret pin:  ");

			let userChoiceToCreateAnotherAccount = prompt("\nDo you want to create another account?  ");

		} while(userChoiceToCreateAnotherAccount.toLowerCase() === "yes");


		while(userInputForCase1.toLowerCase() === "0"))
		{
			let userInputForCase1 = prompt("\nPress 0 to view menu or # to exit program. ");
			
				switch(userInputForCase1){
						case "0":
							console.log(message2);
							let user_option_after_creating_account = prompt("\nEnter an option: ");
		
							switch(userInput2){
								case "1":
									let user_deposit_amount = pasrseInt(prompt("\nHow much will you like to deposit?  "));

									user_account_number = prompt("\nWhat is your account number?  ");
					
									user_pin_number = prompt("\nEnter your pin to complete this transaction:  ");

									console.log("\nTransaction succsesful\nYour new balance is NGN" + newBalance);
									break;
								case "2":
									user_account_number = prompt("\nWhat is your account number?  ");

									console.log("Your account balance is NGN" + customerAccountBalance);
									break;
								case "3":
									let user_withdrawal_amount = pasrseInt(prompt("How much do you want to withdraw? "));
					
									user_account_number = prompt("Enter your account number in order to make a withdraw:  ");
			
									user_pin_number = prompt("Enter your pin to complete this transaction:  ");
									break;
								case "4":
									let sender_account_number = prompt("Enter your account number in order to make a transfer:  ");

									let transfer_amount = Number(prompt("How much do you want to transfer? "));

									let receiver_account_number = prompt("Enter your account number:  ");

									console.log(transactionReport);
									break;
								case "5":
									user_account_number = prompt("Your account number is required to close your account: ");

									console.log(accountStatus);
									break;
								case "#":
									System.exit(0);
								default:
								System.out.println("Invalid input\nTry again.");
						}
				}

		}
}