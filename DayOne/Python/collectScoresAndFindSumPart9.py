sum = 0;
average = 0;
validscorecounter = 0

for i in range(10):
	scores = int(input("Enter a number: "))
	if (validscorecounter < 0):
		continue
	if (validscorecounter > 100):
		continue
	else:
		sum += scores
		validscorecounter+=1
		

average = sum / validscorecounter;

print(f"The sum of valid scores entered is {sum}\nThe average of the valid scores from task 9 is
{average}")