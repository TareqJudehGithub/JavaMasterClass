package src;
import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args){

        System.out.println("\n");

        // Declare temperatures array initializing it with values
        double [] temperatures = {45.66, 39.75, 29.0, 50.2, 33.1};

        // Print out the min temp in temperatures array using minTemp method:
        System.out.println("Min temp is: " + minTemp(temperatures) +"F\n\n");

        // Declare family array initializing it with values
        String [] family = {"Noor Adnan", "Dina Potter", "Leen Goldie", "Tareq Loner"};

        // Print out the longest name in family array using findLongestName method:
        System.out.println("The longest name is: " + findLongestName(family) + "\n");


        // Mario problem (Build a pyramid)
        System.out.println(mario());

    }

    /**
     * A function that returns the minimum temp in a given Array.
     * @param temp array of double values.
     * @return the minimum value in temp.
     */
    public static double minTemp(double[] temp){
        double minValue = temp[0];
        int size = temp.length;

        // Loop over all elements and assign the minimun value to minValue
        for (int i = 0; i < size; i++){
            if (temp[i] < minValue){
                minValue = temp[i];
            }
        }
        return minValue;

    }

    /**
     * A method that returns the longest string.
     * @param names array of string elements.
     * @return the longest string
     */
    public static String findLongestName(String [] names){

        String longestName = names[0];
        int size = names.length;

        // Loop over all elements and assign the longest string to longestName
        for (int index = 0; index < size; index++){
            if (names[index].length() > longestName.length()){
                longestName = names[index];
            }
            else if (names[index].length() == longestName.length()){
            }

        }
        return longestName;
    }

    public static String mario(){
        String block = "#";
        for (int i = 0; i < 6; i++){
            System.out.println(block);
            block += "#";
        }
        return block;

    }
}

