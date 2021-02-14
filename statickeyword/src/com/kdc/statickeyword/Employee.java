package com.kdc.statickeyword;

public class Employee {

    static String boss;
    int daySalary;

     public void printInfo() {
        System.out.println("Employee with boss : " + boss + " and day salary of :" + daySalary);
    }

   public static void printBoss() {
      boss = "Melissa";

   }
}
