const prompt = require("readline-sync");

function getAge(userDob) {
    let daySubstring = userDob.substring(0, 2);
    let monthSubstring = userDob.substring(3, 5);
    let yearSubstring = userDob.substring(6);

    let dayInput = parseInt(daySubstring);
    let monthInput = parseInt(monthSubstring);
    let yearInput = parseInt(yearSubstring);

    let currentDate = new Date();
    let currentYear = currentDate.getFullYear();
    let currentMonth = currentDate.getMonth() + 1; // Month starts from 0
    let currentDay = currentDate.getDate();

    let ageYear = currentYear - yearInput;

    if (currentMonth < monthInput || (currentMonth === monthInput && currentDay < dayInput)) {
        ageYear -= 1;
    }

    return ageYear;
}
let user_input = prompt("Enter your date of birth: ");
console.log(getAge(user_input));