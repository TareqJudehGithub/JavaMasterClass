package learn.java;

public class DiceRandom {
    public static void main(String[] args) {
        // Call method rollDice with 6 sides
        System.out.println(rollDice(6));
        System.out.println(rollDice(8));

    }

    /**
     * Returns a random int in a selected range of numbers (rolling dice total of faces).
     * @param sides determines the range for the random int.
     * @return a random int in a selected range.
     */
    public static int rollDice(int sides){

        double dice = Math.floor(Math.random() * sides + 1);
        return (int)dice;
    }
}

