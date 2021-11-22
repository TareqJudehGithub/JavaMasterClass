/**
 * Practice float and double data types in Java.
 */
public class FloatDouble {
    public static void main(String[] args){

        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Float min value = " + myMinFloat);
        System.out.println("Float max value = " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Float min value = " + myMinDouble);
        System.out.println("Float max value = " + myMaxDouble);

        int myIntValue = 5;
        float myFloatValue = 5f / 2; // casting to float
        double myDoubleValue = 5d / 2;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        // Challenge convert lbs to kgs.
        int weightInLBs = 213;

        double weightInKgs = (double) weightInLBs * 0.45359237;
        System.out.println("Weight it kilos = " + weightInKgs);


    }
}
