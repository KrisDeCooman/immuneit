package com.kdc.inheritance.right;

public class MainClass {

    public static void main(String[] args) {
        Ford fordCar = new Ford();
        fordCar.drive();

        Skoda skodaCar = new Skoda();
        skodaCar.drive();

        Ferrari ferrariCar = new Ferrari();
        ferrariCar.drive();
    }
}
