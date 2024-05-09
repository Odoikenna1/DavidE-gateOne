
message = """
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
"""

print(message)


rows = 3 
columns = 3

tictactoe_board = [[3]*rows]*columns

for index1 in range(rows):
	for index2 in range(columns): 
		user_input = input("\nPlay x or o: ")
		user_option = input("What position would you like to place your character? ")
		match(user_option):
			case "top left":
				tictactoe_board[0][0] = user_input
			case "top center":
				tictactoe_board[0][1] = user_input
			case "top right":
				tictactoe_board[0][2] = user_input
			case "mid left":
				tictactoe_board[1][0] = user_input
			case "mid center":
				tictactoe_board[1][1] = user_input
			case "mid right":
				tictactoe_board[1][2] = user_input
			case "buttom left":
				tictactoe_board[2][0] = user_input
			case "buttom center":
				tictactoe_board[2][1] = user_input
			case "buttom right":
				tictactoe_board[2][2] = user_input

for index1 in range(rows):
	for index2 in range(columns):
		print(f'tictactoe_board { index2 }{ index2 }')
		
	