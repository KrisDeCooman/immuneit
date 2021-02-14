package com.kdc.construct;

public class PersonDemo {

    public static void main(String[] args) {


        Person personObj = new Person();
        System.out.println("First persons age is " + personObj.getAge());


        Person person = new Person(22);
        System.out.println("Second persons age is "+ person.getAge());


    }
}
