package com.kdc.modifiers.meth.privatedemo.packa;

public class Cat {

    private int age = 5;
    private String name = "misty";

    private void printInfo() {
        System.out.println("Cat with name " + name + " and age " + age);
    }

    public void printOtherMethod() {
        printInfo();
    }
}
