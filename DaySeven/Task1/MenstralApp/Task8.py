#Menstral_App

#Write a function that determines flow date

from datetime import datetime, timedelta

def determine_flow_cycle(year, month, day): 
	x = datetime.today()
	last_prediod_date = datetime(year, month, day)
	flow_cycle = x.toordinal() - last_prediod_date.toordinal()
	return flow_cycle

year = int(input("When was your last period date (Enter year)? "))
month = int(input("When was your last period date (Enter month)? "))
day = int(input("When was your last period date (Enter day)? "))

print(determine_flow_cycle(year, month, day))