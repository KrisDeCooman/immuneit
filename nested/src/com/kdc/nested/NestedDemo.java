package com.kdc.nested;

public class NestedDemo {

    public static void main(String[] args) {


        int number = 22;
        if (number > 0) {
            if (number > 5) {
                System.out.println("Number is larger than 5");
            } else if (number == 5) {
                System.out.println("Number is equal to 5");
            }  else {
                System.out.println("Number is between 0 and 5");
            }
        } else if (number == 0) {
            System.out.println("Number is equal to 0");
        } else {
            System.out.println("Number is smaller than 0");
        }
        System.out.println("Ending the nested if statement...");
    }
}
