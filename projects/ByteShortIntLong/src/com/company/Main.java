package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int myValue = 10000;
        System.out.println("int");
    int myMinValue = Integer.MIN_VALUE;
    int myMaxValue = Integer.MIN_VALUE;
    System.out.println("Integer Minimum Value = " + myMinValue);
    System.out.println("Integer Maximum Value = " + myMaxValue);

    System.out.println("Byte");
    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println(myMinByteValue);
    System.out.println(myMaxByteValue);

    System.out.println("short");
    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println(myMinShortValue);
    System.out.println(myMaxShortValue);

    System.out.println("long");
    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println(myMinLongValue);
    System.out.println(myMaxLongValue);

    long myLongValue = 100L; // We must include an uppercase next to long values.

    // Casting (converting data types)
    int myTotal = 100;
    byte myNewTotal = (byte)(myTotal / 2);
        System.out.println(myNewTotal);

    }
}
