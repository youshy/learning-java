package com.company;

// Classes are reference types
// if you want to make it as private - it has to be in it's own file named the same as the class
// Naming convention - Pascal Case
// Full names, as descriptive as possible
class Flight {
    // initial state
    private int passengers;
    private int seats;
    private String planeModel;
    private int timesChecked;

    // constructor
    Flight() {
        seats = 150;
        passengers = 0;
        planeModel = "Boeing";
        timesChecked = 0;
    }

    void addPassenger() {
        if (this.passengers < this.seats) {
            this.passengers += 1;
        } else {
            tooManyPassengers();
        }
    }

    // returns nothing
    void status() {
        System.out.printf("Welcome to this flight.\nNumber of seats: %d\nNumber of passengers: %d\n", this.seats, this.passengers);
        this.timesChecked += 1;
    }

    void checkRecord() {
        System.out.println(this.timesChecked);
        this.timesChecked += 1;
    }

    public String getPlane() {
        return this.planeModel;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    private void tooManyPassengers() {
        System.out.println("Too many passengers on the flight, can not add another one!");
    }

    public boolean hasRoom(Flight secondFlight) {
        int total = this.passengers + secondFlight.passengers;
        return total <= this.seats;
    }

    public Flight createNewFlightWithBoth(Flight secondFlight) {
        Flight newFlight = new Flight();
        newFlight.seats = this.seats;
        newFlight.passengers = this.passengers + secondFlight.passengers;
        return newFlight;
    }
}

public class Main {

    public static void filightInfo() {
        Flight laxToHea = new Flight();

        laxToHea.addPassenger();
        laxToHea.addPassenger();

        laxToHea.status();
        laxToHea.checkRecord();

        for (int i = 0; i < 150; i++) {
            laxToHea.addPassenger();
        }

        laxToHea.checkRecord();

        laxToHea.status();
        laxToHea.checkRecord();

        Flight lax1 = new Flight();
        Flight lax2 = new Flight();

        laxToHea.checkRecord();

        // Initialized to null, this is allowed
        Flight lax3 = null;
        if(lax1.hasRoom(lax2)) {
            lax3 = lax1.createNewFlightWithBoth(lax2);
        }
        lax3.status();
        lax3.checkRecord();
    }

    public static void calcInfo() {
        Calculator[] equations = new Calculator[4];
        equations[0] = create(100.0d, 50.0d, 'a');
        equations[1] = create(134.4d, 153.25323d, 's');
        equations[2] = create(31.3d, 254.22434d, 'd');
        equations[3] = create(11.11d, 22.22d, 'm');

        for(Calculator equation : equations) {
            equation.execute();
            System.out.println("Result = " + equation.result);
        }
    }

    public static Calculator create(double leftVal, double rightVal, char opCode) {
        Calculator equation = new Calculator();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opChar = opCode;

        return equation;
    }

    public static void main(String[] args) {
        calcInfo();
    }
}
