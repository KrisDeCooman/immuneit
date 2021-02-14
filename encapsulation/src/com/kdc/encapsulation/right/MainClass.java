package com.kdc.encapsulation.right;

public class MainClass {

    public static void main(String[] args) {

        Student s = new Student();

        s.setAge(15);
        s.setName("Joel");


        System.out.println("The age of the student is " + s.getAge());
        System.out.println("The name of the student is " + s.getName());
    }
}
