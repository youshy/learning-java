package com.company;

public class Main {

    public static void variables() {
        // Integers

        byte oneByte = 0; // Range from -128 to 127, 8 bits
        short oneShort = 0; // Range from -32768 to 32767, 16 bits
        int oneInt = 0; // Range from -2147483648 to 2147483647, 32 bits
        long oneLong = 0L; // Range from -9223372036854775808 to 9223372036854775807, 64 bits, has to have 'L' by the end

        // Floating point

        float oneFloat = 0.0f; // Range from 1.4 x 10^-45 to 3.4 x 10^38, 32 bits, has to have 'f' by the end
        double oneDouble = 0.0; // Range from 4.9 x 10&-324 to 1.7 x 10^308, can have 'd' by the end

        // Characters
        char regularU = 'U'; // Requires single ticks around
        char accentedU = '\u00DA'; // Can be Unicode code point, '\'u + 4-digit hex value
    }

    public static void operators() {
        // Basic math operators
        double addDouble = 1.0 + 2.0; // 3.0
        int addInt = 1 + 2; // 3

        double substractDouble = 5.0 - 3.0; // 2.0
        int substractInt = 5 - 3; // 2

        double multiplyDouble = 4.0 * 2.0; // 8.0
        int multiplyInt = 4 * 2; // 8

        double divideDouble = 13.0 / 5.0; // 2.6
        int divideInt = 13 / 5; // 2 (the value is getting dropped, not rounded or anything)

        double modulusDouble = 13.0 % 5.0; // 3.0
        int modulusInt = 13 % 5; // 3
    }

    public static void compound() {
        int myVal = 50;
        myVal -= 5;
        System.out.println(myVal); // 45, assigns the value of the result

        // All operations has it's compound version.

        // Operator Precedence:
        // Postfix: x++ x--
        // Prefix: ++x, --x
        // Multiplicative: * / %
        // Addictive: + -
    }

    public static void typeConversion() {
        // Implicit

        int iVal = 05;
        long lVal = iVal; // the lVal will be converted automatically

        // Always goes for largest integer
        // Always goes for double
        // Mixed (int + double) -> goes for double

        // Explicit

        long longValue = 50;
        int integerVal = (int) longValue; // Casts longValue into integer

        // Does whatever we'll tell it to - drops the fractions if narrowed
        // You have to think about it
    }

    public static void checkOperators() {
        int valA = 21;
        int valB = 6;
        int valC = 13;
        int valD = 124;

        int result1 = valA - valB / valC;

        int result2 = (valA - valB) / valC;

        System.out.println(result1);
        System.out.println(result2);
    }

    public static void arrays() {
        // initializing array
        float[] theVals = new float[3];

        // Populating array
        float sum = 0.0f;
        for(int i = 0; i < theVals.length; i++) {
            sum += theVals[i];
        }

        // What if I want to initialize the array already?
        float[] alreadyInitializedVals = { 10.0f, 11.3f, 31.3f };

        // How to loop through?
        float anotherSum = 0.0f;

        for(float currentValue : alreadyInitializedVals) {
            System.out.println("Current value from the array: " + currentValue);
            sum += currentValue;
            System.out.println(sum);
        }
    }

    public static void fizzBuzz(int iterations) {
        int start = 1;

        while (start != iterations + 1) {
            if (start % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (start % 5 == 0) {
                System.out.println("Buzz");
            } else if (start % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(start);
            }
            start++;
        }
    }

    public static void main(String[] strings) {
        fizzBuzz(30);
    }
}
