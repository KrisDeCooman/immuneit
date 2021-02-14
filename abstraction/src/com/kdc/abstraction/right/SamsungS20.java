package com.kdc.abstraction.right;

public class SamsungS20 extends Phone{
    @Override
    public void call() {

        System.out.println("Calling using Samsung");
    }

    @Override
    public void camera() {

        System.out.println("Taking pictures using Samsung");
    }
}
