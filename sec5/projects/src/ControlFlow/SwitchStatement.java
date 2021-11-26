package ControlFlow;

public class SwitchStatement {
    public static void main(String[] args){

        // Check letter
        char letter = 'B';
        switch (letter){
            case 'A': case 'B': case'C': case 'D': case 'E':
                System.out.println("Found");
                break;
            default:
                System.out.println("Not found!");
                break;
        }

        // Check month
        String month = "january";
        String season = "June";
        switch (month.toLowerCase()){
            case "January": case "February": case "December":
                season = "Winter";
                break;
            case "March": case "April": case "May":
                season = "Spring";
                break;
            case "June": case "July": case "August":
                season = "Summer";
                break;
            case "September": case "October": case "November":
                season = "Autumn";
                break;
        }
        System.out.println(season);

        System.out.println("\nDay of the Week challenge");
        // Calling Day of The Week Challenge method:
        printDayOfTheWeek(2);

        System.out.println("\nLeap Year Challenge.");
        isLeapYear(185456989);
    }
    /**
     * Day of the Week challange - returns what day of the week are we in.
     * @param day specifies the day in an int format (for instant Monday = 1, Tuesday = 2, and so forth.)
     */


    public static void printDayOfTheWeek(int day){
        // Declaring String variable todayIs and initialize it a value;
        String todayIs;

        switch (day){
            case 0:
                todayIs = "Monday";
                break;
            case 1:
                todayIs = "Tuesday";
                break;
            case 2:
                todayIs = "Wednesday";
                break;
            case 3:
                todayIs = "Thursday";
                break;
            case 4:
                todayIs = "Friday";
                break;
            case 5:
                todayIs = "Saturday";
                break;
            case 6:
                todayIs = "Sunday";
                break;
            default:
                todayIs = "Invalid day";
                break;
        }
        System.out.println("Today is " + todayIs + ".");
    }
    //

    /**
     * Leap Year challenge - Checks if a given year is a leap year or not.
     * @param year - The int to check.
     * @return true of year is a leap year, and false if not.
     */
    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            if (year % 400 == 0){
                System.out.println(year + " is a leap year. - If statement 400");
                return true;
            }
            else if (year % 100 != 0){
                System.out.println(year + " is NOT a leap year. - If statement 100");
                return false;
            }
            else if (year % 4 == 0){
                System.out.println(year + " is a leap year. - If statement 4");
                return true;
            }
            else {
                System.out.println("False!");
                return false;
            }
        }
        else {
            System.out.println("Invalid year");
            return false;
        }
    }


}
