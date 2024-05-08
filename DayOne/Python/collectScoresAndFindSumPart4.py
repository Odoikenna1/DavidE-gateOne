sum = 0
#average = 0
i = 0


for i in range(10):
	user_input = int(input("Enter a number: "))
	if (i % 2 == 0):
		sum += user_input


print(f"\nThe sum of the inputs at even indexes is {sum}")

