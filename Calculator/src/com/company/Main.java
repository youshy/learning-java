package com.company;
import java.util.Scanner;

public class Main {
    public static void output(Double result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        double result = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Provide first number");
        double val1 = input.nextDouble();
        System.out.println("Provide second number");
        double val2 = input.nextDouble();
        System.out.println("Which operation do you want to perform:\n(a)dd\n(s)ubstract\n(m)ultiply\n(d)ivide");
        char opCode = input.next().charAt(0);

        if (opCode == 'a') {
            result = val1 + val2;
            output(result);
        } else if (opCode == 's') {
            result = val1 - val2;
            output(result);
        } else if (opCode == 'm') {
            result = val1 * val2;
            output(result);
        } else if (opCode == 'd') {
            result = val2 != 0.0d ? val1 / val2 : 0.0d;
            output(result);
        } else {
            System.out.println("Invalid operation!");
        }
    }
}
