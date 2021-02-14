package com.kdc.enums;

public class EnumDemo {


        public static void main(String[] args) {

            // This is an array of our String values that we can use to make an enum.
            String[] scores = {"Low", "Medium", "High", "Top"};

            System.out.println(scores[0]);
            System.out.println(scores[1]);
            System.out.println(scores[2]);
            System.out.println(scores[3]);

            // Below we make use of an enum
            System.out.println("Here is a value from the enum : "+ ScoreEnum.LOW);

    }


}
