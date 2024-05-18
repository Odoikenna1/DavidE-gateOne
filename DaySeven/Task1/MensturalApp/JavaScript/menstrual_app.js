const = prompt("readline-sync");

/*
How to find the number of days to your next period?

to do this, 

we must find the number of days between each period,

we must know how long a client's menstrual cycle is

we can assume the average menstrual cycle as 28 days or ask the user to input it.

To get a somewhat accurate estimate of your client's next period

the program must count 28days (or the n number of days specified by the user) from the last day of your first period.
*/

const users_average_cycle = 28;
let ask_user_to_specify_average_cycle;
 
let ask_user_for_their_period_cycle_length = prompt("Do you know your average period cycle? (yes or no)  ");

if (ask_user_for_their_period_cycle_length === "yes")
{
	ask_user_to_specify_average_cycle = prompt("What is your average period cycle length?  ");
}