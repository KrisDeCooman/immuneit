package com.kdc.modarraylist;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList myList = new ArrayList();
        myList.add(12); // Here we add a primitive to the ArrayList

        // Behind the scenes the following happens
        myList.add(new Integer(12));
        // int primitive will get converted to Integer object, the Wrapper class and added to the ArrayList
        // through the magic of auto-boxing







    }
}
