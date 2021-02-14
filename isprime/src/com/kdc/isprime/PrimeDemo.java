package com.kdc.isprime;

import java.util.Scanner;

public class PrimeDemo {


    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);


        System.out.println("Enter a number : ");
        int myNumb = myInput.nextInt();

        System.out.println("Is number a prime ? " + isPrime(myNumb));


    }

    private static boolean isPrime(int myNumb) {
        boolean isPrimeNumber = false;
        for (int x = 2; x < myNumb; x++) {

            if (myNumb % x == 0) {
                isPrimeNumber = false;
                break;
            } else {
                isPrimeNumber = true;
            }

        }

        return isPrimeNumber;
    }


}

