package com.kdc.divein;

import java.util.Scanner;

public class DiveInDemo {


    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);

        System.out.println("Enter 1st number : ");
        int firstNumber = myInput.nextInt();

        System.out.println("Enter 2nd number : ");
        int secondNumber = myInput.nextInt();

        int result = firstNumber + secondNumber;

        System.out.println("The result of the calculation is : " + result);

    }
}
