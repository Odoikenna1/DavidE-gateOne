sum = 0;
average = 0;
evenNumberCounter = 0;

for i in range(10):
	user_input = int(input("Enter a number: "))
	if (user_input % 2 == 0):
		sum += user_input
		evenNumberCounter+=1

average = sum / evenNumberCounter;

print(f"The sum of the even numbers entered by the user is {sum}\nThe average of the even numbers entered is {average}")




