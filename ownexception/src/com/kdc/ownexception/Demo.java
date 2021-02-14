package com.kdc.ownexception;

public class Demo {

    public static void main(String[] args) {

        int a = 5;

        if(a < 10) {
            try {
                throw new MyException("error");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
