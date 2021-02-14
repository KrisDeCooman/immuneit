package com.kdc.wrapper;

import java.util.ArrayList;

public class WrapperDemo {

    public static void main(String[] args) {

        // primitive
        int myInt = 7;

        // Wrapper class that creates an object with reference mySecondInt
        Integer mySecondInt = new Integer(7); // Boxing
        Integer myThirdInt = 7; // Autoboxing

        // Unboxing aka fetching the primitive value from the object
        int myFourthInt = myThirdInt.intValue();

        // AutoUnboxing
        int myFifthInt = myThirdInt;


        /* Here I have an arraylist or a type of collection, as you can see, we can add int values to it but also String values. Sometimes however we only want to be able to stored specific datatypes in the
        collections. Here we use the principle of generics.
         */

        ArrayList myList = new ArrayList();

        myList.add(5);
        myList.add(9);
        myList.add("Kris");




        for (int x = 0; x < myList.size(); x++) {
            System.out.println("Value is " + myList.get(x));
        }


        Character c1 = new Character('c');
        Character c2 = 'c';

        Boolean b1 = new Boolean(true);
        Boolean b2 = true;

        String myTest = "200";

        int a = Integer.parseInt(myTest);

        int calculation = a + 400;

        System.out.println("The result of the calculation is " + calculation);


    }
}
