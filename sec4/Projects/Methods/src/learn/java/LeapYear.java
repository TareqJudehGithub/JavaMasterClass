package learn.java;

public class LeapYear {
    public static void main(String[] args) {
        // Calling isLeapYear method
        isLeapYear(1582);
    }
    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            if (year % 400 == 0)
            {
                System.out.println(year + " is a leap year. If statement 400");
                return true;
            }
            else if (year % 100 == 0){
                System.out.println(year + " is NOT a leap year. If statement 100");
                return false;
            }
            else if (year % 4 == 0){
                System.out.println(year + " is a leap year. If statement 4");
                return true;
            }
            else {
                System.out.println(year + " is NOT a leap year.");
                return false;
            }
        }

        else{
            System.out.println("Year out of range.");
            return false;
        }
    }
}

