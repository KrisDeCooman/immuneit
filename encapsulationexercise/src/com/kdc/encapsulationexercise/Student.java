package com.kdc.encapsulationexercise;

public class Student {

    private String firstName;
    private String lastName;
    private Teacher teacher;

    public Student(String firstName, String lastName, Teacher teacher) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teacher = teacher;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        System.out.println("Changing teacher of student " + firstName + " to " + teacher.getFirstName() + " " + teacher.getLastName());
        this.teacher = teacher;
    }
}
