package Loops;

public class WhileLoop {
    public static void main(String[] args){

        int i = 0;

        while (i < 3) {
            System.out.println(i);
            i++;
        }

        // Googal
        String googal = "1";
        int len = googal.length();

        while (len < 101){
            System.out.println(len);
            googal += "0";
            len = googal.length();
        }

        // Calling keepRolling method
        System.out.println("Total rolls = " + keepRolling() + "\n");

        // calling method numOfWarnings
        raiseAlarm(5);

    }


    // Methods
    /**
     * Keep rolling method - calculates dice roll attempts it take to get a roll match (Yahtzee).
     * @return Returns total attempts before achieving a Yahtzee.
     */

    public static int dice() {
        // dice1 and dice2 roll build up
        double rollDice = Math.floor(Math.random() * 6 + 1);
        int intRollDice = (int) rollDice;
        return intRollDice;
    }

    public static int keepRolling() {
        // counter to track number of rolls with initial value of 0.
        int counter = 0;

        // Declare 2 dices variables with dice method as an initial value
        int dice1 = dice();
        int dice2 =dice();
        while ( !(dice1 == dice2 )){
            dice1 = dice();
            System.out.println("Dice1: " + dice1);

            dice2 = dice();
            System.out.println("Dice2: " + dice2);
            counter ++;
            System.out.println("Counter = " + counter + "\n");
        }
        return counter;
    }

    /**
     * print certain amount of warning using while loop
     * @param numOfWarning - Number of time to print warning
     */
    public static void raiseAlarm(int numOfWarning){

        int i = 1; // loop counter
        while (i <= numOfWarning) {
            System.out.println("Warning!");
            i++; // loop increment
        }

    }

}
