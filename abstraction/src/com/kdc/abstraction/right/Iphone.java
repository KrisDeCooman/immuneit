package com.kdc.abstraction.right;

public class Iphone extends Phone{
    @Override
    public void call() {

        System.out.println("Call using Iphone");

    }

    @Override
    public void camera() {

        System.out.println("Taking pictures with Iphone");

    }
}
