/**
 * Operators practice in Java
 * @author Tareq Judeh
 */
public class Operator {
    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        int previousResult = result;
        System.out.println("PreviousResult = " + previousResult);

        result = result - 1;
        result = result * 10;
        result = result / 2;

        System.out.println(result);

        // remainder
        result = result % 3; // 10 % 3 = 10 - 9 = 1
        System.out.println("Remainder = " + result);

        result ++;  // result = result + 1  => 1 + 1 = 2

        System.out.println(result);

        result +=8;   // result = 2 + 8 = 10
        System.out.println(result);

        result *= 10;

        System.out.println(result);

        // Logical Operators
        boolean isAlien = false;

        // If statement
        if (isAlien) {
            System.out.println("Is an alien");
        }
        else {
            System.out.println("Not an alien");
        }

        int topScore = 100;
        int secondTopScore = 60;

        if (topScore > secondTopScore && topScore < 100){
            System.out.println("You got the high score!");
        }
        boolean isRain = true;
        boolean isSnow = false;

        if (isRain && isSnow){
            System.out.println("Stay home and drink hot chocolate!");

        }
        else if (isRain && !isSnow){
            System.out.println("Make sure you take an umbrella!");
        }
        else {
            System.out.println("Buy grocery!");
        }

        // ternary operators
        boolean isCar = true;
        String carOrNot = isCar ? "This is a car" : "This is not a car";
        System.out.println(carOrNot);

        int year = 2000;

    }
}
