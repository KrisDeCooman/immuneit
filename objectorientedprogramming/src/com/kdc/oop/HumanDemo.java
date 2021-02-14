package com.kdc.oop;

public class HumanDemo {

    public static void main(String[] args) {

        Human someName = new Human("Kris", 36, "kdecooman@immune.it");

        someName.walk();
        someName.sendEmail();
    }
}
