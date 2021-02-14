package com.kdc.polymorphism;

public class MainClass {

    public static void main(String[] args) {

        // Create an array of Animals
        Animal[] kingdom = new Animal[3];

        kingdom[0] = new Dog();
        kingdom[1] = new Cat();
        kingdom[2] = new Cow();

        // Animal theCat = new Cat();


        for (int x = 0; x < kingdom.length; x++) {
            kingdom[x].speak();
        }

    }
}
