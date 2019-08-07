package com.company;

class Earth {
    // Field initializers - basically, assigning the default value from the very start
    // Otherwise - it'd be 0.
    long circumferenceInMiles = 24901;
    long circumferenceInKilometers = Math.round(circumferenceInMiles * 1.6d);
    int humans = 0;
    int diseases = 0;
    int oceans = 0;
    int mountains = 0;
    int species = 0;
    double rainyDays = 0;

    // Constructor
    // What happens if you don't have one?
    // if the constructor won't be explicitly provided, then it will be created by default by the Java compiler
    // if you will create one, then it will be the primary one

    // one class can have as many class as it needs to - it's called overloading the constructor
    // meaning - the class comes in multiple versions
    public Earth() {

    }

    // Chaining constructors
    // Rule - the caller has to be the first line!
    public Earth(int oceans, int mountains) {
        // this will go to the oceans constructor below
        this(oceans);
        this.mountains = mountains;
    }

    // Set everything
    public Earth(int oceans) {
        // this will chain down to the constructor below (goes by the data type)
        this(oceans > 1 ? 100.5d : 0.0d);
    }

    // This is a private constructor
    private Earth(double rainyDays) {
        this.rainyDays = rainyDays;
    }

    public long getCircumferenceInKilometers() {
        return circumferenceInKilometers;
    }

    public long getCircumferenceInMiles() {
        return circumferenceInMiles;
    }
}

// Reimplementation of that Flight class

class Flight {
    private int passengers, flightNumber, seats = 150;
    private char flightClass;
    private boolean[] isSeatAvailable;

    // This is an initialization block
    // no need to chain to more things, it'll run every time when the class will be invoked
    {
        isSeatAvailable = new boolean[seats];
        for(int i = 0; i < seats; i++) {
            isSeatAvailable[i] = true;
        }
    }

    public Flight() { }

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this.flightClass = flightClass;
    }
}

// Order:
// 1. Field initialization
// 2. Initialization blocks
// 3. Constructor

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
