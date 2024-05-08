sum = 0
#average = 0

for i in range(10):
	user_input = int(input("Enter a number: "))
	if (user_input % 2 == 0):
		sum += user_input

#average = sum / i;

print(f"The sum of the even numbers entered by the user is {sum}")




