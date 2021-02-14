package com.kdc.foreachloop;

import java.util.ArrayList;

public class ForEachDemo {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(0);
        myList.add(-4);
        myList.add(44);
        myList.add(11);
        myList.add(9);

        for(int x : myList) {
            System.out.println("Next value of arraylist is " + x);
        }

    }
}
