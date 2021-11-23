package learn.java;

public class SpeedConverter {
    public static void main(String[] args) {
        // Calling functions

        printConversion(123);

    }
    /**
     * Method that converts kilo per hours to miles per hours
     */
    public static double toMilesPerHour(double kilometersPerHour){
        if ( kilometersPerHour < 0){
            return  -1;
        }
        else {

            return kilometersPerHour / 1.609;
        }

    }
    public static void printConversion(double kilometersPerHour){
        System.out.println(kilometersPerHour + " KM = " +
                Math.round(toMilesPerHour(kilometersPerHour)*100) / 100.00 + " Miles");


    }
}
