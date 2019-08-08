package com.company;

// Every class will ALWAYS inherit from native Object class
abstract class Garage {
    // Abstract - this implicitly requires any inheriting class to override this method
    // Not used that much...
    // Also - it is required that the whole class will be marked as abstract
    public abstract void readyToDrive(boolean status);
}

class Car extends Garage{
    private int wheels = 4;
    public int HP;

    public Car() {
        System.out.println("I am a new car!");
    }

    public Car(int HP) {
        this.HP = HP;
    }

    // Final - this prevents from inheriting and/or overriding this method
    public final void ride() {
        System.out.println("Vrooom!");
    }

    public int getHP() {
        return HP;
    }

    @Override
    public void readyToDrive(boolean status) {
        if(status) {
            System.out.println("LET'S GO");
        } else {
            System.out.println("Probably there's something extra to do here...");
        }
    }

    // Override native Object method
    @Override
    public boolean equals(Object o) {
        // Super - allows to access the base method before the modifications
        // This way, if you want to check if object and reference to the same object is equal
        if(super.equals(o)) {
            return true;
        }

        // This will prevent from checking f.e. RaceCar against the Car
        if(!(o instanceof Car)) {
            return false;
        }

        // Cast into type
        Car other = (Car) o;

        return wheels == other.wheels;
    }
}

class RaceCar extends Car {
    public void nitro() {
        System.out.println("NOW I AM THE FASTEST");
    }

    @Override
    public int getHP() {
        return this.HP + 300;
    }
}

public class Main {

    public static void main(String[] args) {
        RaceCar honda = new RaceCar();

        honda.ride();

        honda.nitro();
        honda.readyToDrive(true);

        int hondaHorsepower = honda.getHP();
        System.out.println(hondaHorsepower);

        Car toyota = new Car(20);
        toyota.readyToDrive(true);

        int toyotaHorsepower = toyota.getHP();
        System.out.println(toyotaHorsepower);

        Car bmw = new Car(40);
        bmw.readyToDrive(false);

        if (bmw.equals(toyota)) {
            System.out.println("These are basically the same car!");
        }
    }

}
