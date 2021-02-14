package com.kdc.finalkeyword;

public class Car {

    // Best practice to write final variables in UPPERCASE
    private final int WEIGHT = 1500;

    public static void main(String[] args) {

        Car c = new Car();
        System.out.println("The weight of the car is " + c.WEIGHT);

        c.startEngine();
    }

    // This will not work, you can't change a variable if it is final
    /*public void changeWeight() {
        WEIGHT = 1600;
    }*/

    public final void startEngine() {
        System.out.println("Vroom vroom.");
    }
}
