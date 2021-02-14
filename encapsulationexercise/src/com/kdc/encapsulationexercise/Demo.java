package com.kdc.encapsulationexercise;

public class Demo {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Bert", "Vandenberghe");
        Student s = new Student("Kris", "De Cooman", t1);


        System.out.println("Student " + s.getFirstName() + " has a teacher with name " + s.getTeacher().getFirstName() + " " + s.getTeacher().getLastName());

        Teacher t2 = new Teacher("Tom", "De Wilde");
        s.setTeacher(t2);

        System.out.println("Student " + s.getFirstName() + " now has a teacher with name " + s.getTeacher().getFirstName() + " " + s.getTeacher().getLastName());

    }
}
