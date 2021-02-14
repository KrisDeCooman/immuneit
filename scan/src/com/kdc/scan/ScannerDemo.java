package com.kdc.scan;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String myName = myInput.nextLine();

        System.out.println("My name is " + myName);

        myInput.close();
    }
}
