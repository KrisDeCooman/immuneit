package com.kdc.inheritance.wrong;

public class MainClass {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.drive();

        Ford fordCar = new Ford();
        fordCar.drive();

        Skoda skodaCar = new Skoda();
        skodaCar.drive();
    }
}
