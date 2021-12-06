package Arrays;

public class Arrays {
    public static void main(String[] args){

        // Declare a new array initializing it with some values:
        String [] newOutlet = {"abc", "bbc", "CNN", "CBS", "AP", "NBC", "FOX", "npr", "sky", "Al Jazeera"};

        // prints the array location in memory:
        System.out.println(newOutlet + "\n");

        // Iterate over arrays elements and print them all:
        for (String value : newOutlet) {
            System.out.println(value);
        }
        System.out.println("\n");

        // Pick a random element from the array:

        // 1. Declare lucky variable which will serve as a random index number
        double lucky = Math.random() * 10;
        // Convert lucky variable to int
        int luckyIndex = (int) lucky;
        // print out a random element from array newOutlet:
        System.out.println(newOutlet[luckyIndex]);

        System.out.println("\n");
        // CalculateAverage method
        System.out.println(calculateAverage(new double[]{55, 44, 88, 77}));
    }

    // Loop over arrays
    public static double calculateAverage(double[] temperates){
        // Array size
        int size = temperates.length;
        System.out.println("Size = " + size);
        // sum all items/elements inside temperates
        double total = 0;

        // Loop over all temperates items and add them to total variable:
        for (int i = 0; i < size; i ++){
            total += temperates[i];
        }
        System.out.println("Total = " + total);
        double average = total/size;
        return average;
    }
}
