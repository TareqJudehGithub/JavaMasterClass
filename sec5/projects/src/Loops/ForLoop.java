package Loops;

public class ForLoop {
    public static void main(String[] args){
        // Calling method raiseWarning
        raiseWarning(5);

        // Calling pyramids method
        System.out.println(pyramids(3));
    }
    /**
     * foor loop practice
     * @param numOfWarning - number of warnings to print
     */
    public static void raiseWarning(int numOfWarning){
        // for loop structure => (loop counter; loop condition; increment counter)
            // loop body - action;

        for (int i = 0; i <= numOfWarning; i++){
            System.out.println("Warning!" + " " + i);
        }
    }
    /**
     * Pyramid - A method that calculates number of blocks needed to build a pyramid.
     * @param levels - number of levels for building the pyramid.
     */
    public static int pyramids(int levels){
        int blocks = 0;
        for (int i = 0; i <= levels; i++){
            blocks += i * i;
        }
        return blocks;
    }
}

