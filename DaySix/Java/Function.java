import java.time.LocalDate;

public class Function {
    
    public static int getAge(String userDob) {
        
		String daySubstring = "";

		String monthSubstring = "";
		String yearSubstring = "";

		int dayInput = 0;
		int monthInput = 0;
		int yearInput = 0;

		daySubstring += String.valueOf(userDob.charAt(0));
		daySubstring += String.valueOf(userDob.charAt(1));

		monthSubstring += String.valueOf(userDob.charAt(3));
		monthSubstring += String.valueOf(userDob.charAt(4));

		yearSubstring += String.valueOf(userDob.charAt(6));
		yearSubstring += String.valueOf(userDob.charAt(7));
		yearSubstring += String.valueOf(userDob.charAt(8));
		yearSubstring += String.valueOf(userDob.charAt(9));

		if (userDob.charAt(0) == '0') {
			dayInput = Integer.parseInt(String.valueOf(daySubstring.charAt(1)));
		} else {

			dayInput = Integer.parseInt(daySubstring);

		}
		if (userDob.charAt(3) == '0') {
			monthInput = Integer.parseInt(String.valueOf(monthSubstring.charAt(1)));
		} else {

			monthInput = Integer.parseInt(monthSubstring);

		}

		yearInput = Integer.parseInt(yearSubstring);

		int currentYear = LocalDate.now().getYear();
		int currentDay = LocalDate.now().getDayOfMonth();
		int currentMonth = LocalDate.now().getMonthValue();

		int ageYear = currentYear - yearInput;

		if (currentMonth < monthInput) {
			ageYear = ageYear - 1;
		} else if (currentMonth == monthInput) {

			if (dayInput > currentDay) {

				ageYear = ageYear - 1;
			}
		}

		return ageYear;
    }
}
