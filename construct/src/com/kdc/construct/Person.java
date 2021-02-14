package com.kdc.construct;

public class Person {

    private int age;
    private int weight;
    private String gender;
    private String job;


    //default constructor
    public Person() {
        age = 15;
    }

    // constructor with age as argument
    public Person(int age) {
        this.age = age;
    }

    // constructor with age and weight as argument
    public Person(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    // constructor with age, weight, gender and job as argument
    public Person(int age, int weight, String gender, String job) {
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.job = job;
    }


    public int getAge() {
        return age;
    }
}
