package com.kdc.printer;

public class Printer implements ICopy, IScan{
    @Override
    public void copy() {
        System.out.println("Printer is copying");
    }

    @Override
    public void scan() {
        System.out.println("Printer is scanning");
    }

    public void print() {
        System.out.println("Printer is printing");
    }
}
