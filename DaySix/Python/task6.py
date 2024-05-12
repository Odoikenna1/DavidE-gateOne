from datetime import datetime

def get_age(user_dob):
    day_input = int(user_dob[0:2])
    month_input = int(user_dob[3:5])
    year_input = int(user_dob[6:])

    current_date = datetime.now()
    current_year = current_date.year
    current_month = current_date.month
    current_day = current_date.day

    age_year = current_year - year_input

    if current_month < month_input or (current_month == month_input and current_day < day_input):
        age_year -= 1

    return age_year

user_input = input("Enter your date of birth: ")
print(get_age(user_input))