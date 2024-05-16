sum_odd_digits = 0
sum_even_digits = 0

total = 0

#step1 
card_number = input("Enter a card number: ")
card_number = card_number.replace("-", "")
card_number = card_number.replace(" ", "")
card_number = card_number[::-1]
print(card_number)


#step2
for x in card_number[::2]:
    sum_odd_digits += int(x)
    
#step3
for x in card_number[1::2]:
    x = int(x) * 2
    if x >= 10:
        sum_even_digits += (1 + (x % 10))
    else:
        sum_even_digits += x
        
#step4
if total % 10 == 0:
    print("This card is valid")
    
else:
    print("Invalid")