package com.kdc.finallyblock;

public class FinallyDemo {

    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        try {
            System.out.println(a /b);
        } catch (ArithmeticException ae) {
            System.out.println("Cannot divide by 0");
        } finally {
            System.out.println("Exiting the program....");
        }



    }
}
