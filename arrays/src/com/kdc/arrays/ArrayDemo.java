package com.kdc.arrays;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] myNumber = {1,2,3};

        System.out.println("the length of the array is " + myNumber.length);


        String [] names;
        // Below will not work, why not ?
        //names[2] = "Kris";

        String[] myNames = {"kris"};



        // Will not work because an array must contain values of the same datatype as the datatype of the array.
       // int [] theNumbers = {2,33,56,21,11, "Kris"};


        int [] theNumbs = new int[3];

     /*   theNumbs[3] = 5;
        System.out.println(theNumbs[3]);*/

        // Creating an array that stored objects of the type person
        Person[] personArray = {new Person("Kris", "De Cooman"), new Person("Yannick", "Osselear")};

        // Another way to stored objects of type Person in an array.
        Person p1 = new Person("Tom", "De Smet");
        Person p2 = new Person("Vincent", "Kompany");

        Person[] anotherPersonArray = new Person[2];
        anotherPersonArray[0] = p1;
        anotherPersonArray[1] = p2;

        // To print the values in the array
       //System.out.println(Arrays.toString(anotherPersonArray));




    }
}
