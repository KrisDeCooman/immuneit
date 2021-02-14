package com.kdc.encapsulation.wrong;

public class MainClass {

    public static void main(String[] args) {
        Student s = new Student();

        // dangerous to use this type of data changing since there is absolutely no logging when the program executes
        s.age = 15;
        s.name = "Joel";

        System.out.println("Student with name " + s.name + " has an age of " + s.age);
    }
}
