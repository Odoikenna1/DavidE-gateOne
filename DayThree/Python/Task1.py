import random

correct_answer = 0
incorrect_answer = 0
for count in range(10):
	random_number1 = random.randint(1, 20)
	random_number2 = random.randint(1, 10)
	user_input = input(f"{random_number1} + {random_number2} = ")
	if user_input == random_number1 + random_number2:
		correct_answer+=1
	else:
		incorrect_answer+=1

print(f"Game Over\nYou got {correct_answer} correct\nYou got {incorrect_answer} incorrect")