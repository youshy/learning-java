package com.company;

public class Main {

    public static void logicalOperators() {
        // & - And
        // | - Or
        // ^ - Exclusive or (XOR)
        // ! - Negation

        int a = 20, b = 20, c = 5;

        if (a == b && a > c) {
            System.out.println("It's true!");
        }

        if (a == b ^ c > a) { // first is true, second is false, other way around works as well
            System.out.println("It's true");
        }

        // Conditional logical
        // && - Conditional And - executes right-side if left-side is true
        // || - Conditional Or - executes right side if left-side is false
    }

    public static void whileLoop() {
        int kVal = 5;
        int factorial = 1;

        while(kVal > 1) {
            System.out.println("Before: " + kVal);
            factorial *= kVal;
            kVal -= 1;
            System.out.println("After: " + kVal);
        }
        System.out.println(factorial);
    }

    public static void doWhileLoop() {
        int iVal = 5;
        do {
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 100);
    }

    public static void forLoop() {
        for (int iVal = 1; iVal < 100; iVal *= 2) {
            System.out.println(iVal);
        }
    }

    public static void main(String[] args) {
    }
}
