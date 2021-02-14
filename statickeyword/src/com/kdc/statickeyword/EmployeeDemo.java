package com.kdc.statickeyword;

public class EmployeeDemo {

    public static void main(String[] args) {
        Employee.printBoss();

        Employee firstEmployee = new Employee();
        firstEmployee.daySalary = 60;

        Employee secondEmployee = new Employee();
        secondEmployee.daySalary = 100;

        firstEmployee.printInfo();
        secondEmployee.printInfo();


    }
}
