package com.kdc.unaryoperator;

public class UnaryOperatorDemo {

    public static void main(String[] args) {

        int a =0;
        int theSum1 = (a++) + (a++) + (a++); // Use a and increment it
        System.out.println("The result of the sum is " + theSum1);


        int b = 0;
        int theSum2 = (++b) + (++b) + (++b); // Increment b and use it
        System.out.println("The result of the sum is " + theSum2);
    }
}
