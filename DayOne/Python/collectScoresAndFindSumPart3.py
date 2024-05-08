sum = 0
average = 0
i = 0

for i in range(10):
	user_input = int(input("Enter a number: "))
	sum += user_input

average = sum // i
print(f"The sum of the user input is {sum}\nThe average of the user input is {average}")