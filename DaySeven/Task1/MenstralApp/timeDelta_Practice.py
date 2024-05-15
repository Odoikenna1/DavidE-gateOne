from datetime import datetime, timedelta

current_period_date = datetime(2024, 5, 15)
last_period_date = datetime(2024, 3, 4)
difference = current_period_date - last_period_date 

print(difference.days)