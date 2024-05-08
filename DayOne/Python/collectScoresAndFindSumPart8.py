sum = 0;
average = 0;


for i in range(10):
	scores = int(input("Enter a number: "))
	if (scores < 0):
		continue
	if (scores > 100):
		continue
	else:
		sum += scores
		

#average = sum / i;

print(f"The sum of valid scores entered is {sum}")