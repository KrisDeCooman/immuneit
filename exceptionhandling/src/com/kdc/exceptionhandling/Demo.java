package com.kdc.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo {

    public static void main(String[] args) {

        /*int a = 5;
        int b = 0;

        int c = a / b;

        System.out.println("The result is " + c);*/


        int a = 5;
        int b = 0;

        try {
            int c = a / b;
            System.out.println("The result is " + c);

            FileOutputStream fos = new FileOutputStream("test.txt");

        } catch (ArithmeticException ae) {
            System.out.println("You tried to divide by 0");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
