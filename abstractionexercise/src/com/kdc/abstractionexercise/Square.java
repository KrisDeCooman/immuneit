package com.kdc.abstractionexercise;

public class Square extends Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        int area = side * side;
        return area;
    }
}
