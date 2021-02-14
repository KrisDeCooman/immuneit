package com.kdc.forloopexercise;

import java.util.Scanner;

public class ForLoopDemo {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.println("How much numbers would you like to enter ? ");
        int amountOfNumbers = myInput.nextInt();

        int additionResult = 0;
        for(int x = 1; x <= amountOfNumbers; x++) {
            System.out.print("Enter number " + x+ " : ");
            int theNumber = myInput.nextInt();
            additionResult+=theNumber;
        }

        System.out.println("Addition of all numbers : " + additionResult);
    }
}
