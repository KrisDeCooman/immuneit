package com.kdc.stringcompare;

public class CompareDemo {

    public static void main(String[] args) {

        String str1 = "abc";
        String str3 = new String("abc");

        System.out.println(str1 == str3);
        // -> will print false because both will point to difference objects in memory
    }
}
