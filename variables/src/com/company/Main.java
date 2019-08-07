package com.company;

public class Main {

    public static void main(String[] args) {
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
        char accentedU = '\u00DA'; // Can be Unicode code point, \u + 4-digit hex value
    }
}
