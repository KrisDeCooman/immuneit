package com.kdc.encapsulation.right;

public class Student {

    private int age;
    private String name;

    public int getAge() {
        System.out.println("User getting the age of the student");
        return age;
    }

    public void setAge(int age) {
        System.out.println("User modifying the age of the student");
        this.age = age;
    }

    public String getName() {
        System.out.println("User getting the name of the student");
        return name;
    }

    public void setName(String name) {
        System.out.println("User modifying the nane of the student");
        this.name = name;
    }
}
