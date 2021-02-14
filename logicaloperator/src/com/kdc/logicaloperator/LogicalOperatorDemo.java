package com.kdc.logicaloperator;

public class LogicalOperatorDemo {

    public static void main(String[] args) {

        int a = 15;
        String myString = "Kris";

        System.out.println((a > 10) && (myString.equalsIgnoreCase("KRIS"))); // returns true

        System.out.println((a > 20) && (myString.equalsIgnoreCase("KRIS"))); // returns false

        System.out.println((a > 10) && (myString.equalsIgnoreCase("bart"))); // returns false

        System.out.println((a > 10) || (myString.equalsIgnoreCase("KRIS"))); // returns true

        System.out.println((a > 20) || (myString.equalsIgnoreCase("bart"))); // returns false

        System.out.println((a > 10) || (myString.equalsIgnoreCase("bart"))); // returns true

        System.out.println(!(a > 10)); // returns false


    }
}
