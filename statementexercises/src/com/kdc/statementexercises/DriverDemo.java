package com.kdc.statementexercises;

import java.util.Scanner;

public class DriverDemo {

    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);

        System.out.println("How old is the person ? ");
        int theAge = myInput.nextInt();

        Person p = new Person(theAge, Gender.MALE);

        if (p.getAge()>= 18) {
            if(p.getGender() == Gender.MALE) {
                System.out.println("Male driver in the car.");
            } else {
                System.out.println("Female driver in the car.");
            }
        } else {
            System.out.println("You are too young to drive a car.");

        }
    }
}
