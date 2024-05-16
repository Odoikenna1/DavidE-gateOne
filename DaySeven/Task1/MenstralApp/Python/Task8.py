#Menstral_App

#Write a function that determines flow date

import datetime

def determine_last_prediod_date(year, month, day): 
	#x = datetime.today()
	last_prediod_date = datetime.date(year, month, day)
	
	#flow_cycle = x.toordinal() - last_prediod_date.toordinal()
	return last_prediod_date

def determine_ovulation_date(menstral_cycle_length ,last_period_date):
	ovulation_date = last_period_date + datetime.timedelta(menstral_cycle_length - 14)
	return ovulation_date
	
def determine_first_safe_date(menstral_cycle_length ,last_period_date):
	ovulation_date = determine_ovulation_date(menstral_cycle_length ,last_period_date)
	first_safe_date = ovulation_date + datetime.timedelta(2)
	return first_safe_date

def determine_last_safe_date(menstral_cycle_length ,last_period_date):
	ovulation_date = determine_ovulation_date(menstral_cycle_length ,last_period_date)
	last_safe_date = ovulation_date + datetime.timedelta(14)
	return last_safe_date

def determine_first_fertile_date(menstral_cycle_length ,last_period_date):
	ovulation_date = determine_ovulation_date(menstral_cycle_length ,last_period_date)
	first_fertile_date = ovulation_date + datetime.timedelta(-4)
	return first_fertile_date

def determine_last_fertile_date(menstral_cycle_length ,last_period_date):
	ovulation_date = determine_ovulation_date(menstral_cycle_length ,last_period_date)
	last_fertile_date = ovulation_date + datetime.timedelta(1)
	return last_fertile_date

def determine_first_date_of_next_period(menstral_cycle_length ,last_period_date):
	ovulation_date = determine_ovulation_date(menstral_cycle_length ,last_period_date)
	first_date_of_next_period = ovulation_date + datetime.timedelta(14)
	return first_date_of_next_period


def determine_last_date_of_next_period(menstral_cycle_length ,last_period_date, period_length):
	first_date_of_next_period = determine_first_date_of_next_period(menstral_cycle_length ,last_period_date)
	last_date_of_next_period = first_date_of_next_period + datetime.timedelta(period_length - 1)
	return last_date_of_next_period


year = int(input("When was your last period date (Enter year)? "))
month = int(input("When was your last period date (Enter month)? "))
day = int(input("When was your last period date (Enter day)? "))

period_length = int(input("Whats the average length period? "))
menstral_cycle_length = int(input("Whats the average lenght of menstral cycle? "))

last_period_date = determine_last_prediod_date(year, month, day)
print(determine_last_prediod_date(year, month, day))
print(determine_ovulation_date(menstral_cycle_length ,last_period_date))
print(determine_first_date_of_next_period(menstral_cycle_length ,last_period_date))
print(determine_last_date_of_next_period(menstral_cycle_length ,last_period_date, period_length)) 
