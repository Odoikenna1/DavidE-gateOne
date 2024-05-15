#Menstral_App

#Write a function that determines flow date

from datetime import date

def determine_flow_cycle(last_prediod_date):
	current_period_date = datetime.now() 
	flow_cycle = last_prediod_date - current_period_date
	return current_period_date

= int(input("When was your last period date? "))