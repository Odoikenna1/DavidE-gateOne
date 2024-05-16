#Menstral_App

#Write a function that determines flow date

import datetime

def determine_flow_cycle(year, month, day): 
	#x = datetime.today()
	last_prediod_date = datetime.date(year, month, day)
	
	#flow_cycle = x.toordinal() - last_prediod_date.toordinal()
	return last_prediod_date

def ovulation_date(menstral_cycle_length ,last_prediod_date):
	ovulation_date = last_prediod_date + datetime.timedelta(menstral_cycle_length -13)
	return ovulation_date
	
def determine_first_safe_date(menstral_cycle_length ,last_prediod_date):
	
year = int(input("When was your last period date (Enter year)? "))
month = int(input("When was your last period date (Enter month)? "))
day = int(input("When was your last period date (Enter day)? "))

period_length =int(input("Whats the average lenght period?  "))
average_length_ofmenstral_cycle =int(input("Whats the average lenght of menstral cycle?  "))


print(determine_flow_cycle(year, month, day))
