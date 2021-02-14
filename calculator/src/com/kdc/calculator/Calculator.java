package com.kdc.calculator;

public class Calculator {

    private int firstNumb;
    private int secondNumb;

    public Calculator(int firstNumb, int secondNumb) {
        this.firstNumb = firstNumb;
        this.secondNumb = secondNumb;
    }

    public int addNumbers() {
        int result = firstNumb + secondNumb;

        return result;
    }
}
