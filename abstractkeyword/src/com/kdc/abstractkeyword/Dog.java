package com.kdc.abstractkeyword;

public abstract class Dog {

    private String breed;
    private int age;

    public void makeNoise() {
        System.out.println("Woof");
    }

    public abstract void eat() ;
}
