package com.kdc.oop;

public class Human {

    private String name;
    private int age;
    private String email;

    public Human(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void walk() {

        System.out.println(name + " is walking and has an age of " + age);
    }

    public void sendEmail() {
        System.out.println("Sending a mail to " + email);
    }
}
