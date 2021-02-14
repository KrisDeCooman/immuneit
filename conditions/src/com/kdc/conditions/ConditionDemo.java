package com.kdc.conditions;

import java.util.Scanner;

public class ConditionDemo {

    public static void main(String[] args) {

        int x = 11;

        if (x <= 10) {
            System.out.println(x + " is smaller or equal than 10.");
        } else {
            System.out.println(x + " is larger than 10.");
        }

        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter a number representing a month : ");
        int month = myInput.nextInt();

        int daysInMonth = 0;
        switch (month) {
            case 1:
                daysInMonth = 31;
                break;
            case 4:
                daysInMonth = 30;
                break;

            case 5:
                daysInMonth = 31;
                break;

            default :
                break;

        }

        System.out.println("The amount of days for the month you entered was : " + daysInMonth);
    }
}
