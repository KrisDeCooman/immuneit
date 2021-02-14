package com.kdc.multiarrays;

public class MultiArrayDemo {

    public static void main(String[] args) {

        // 2d array of 2 rows with 1 column
        String[][] myMultiArray = new String[2][1];

        myMultiArray[0][0] = "Kris";


        Person p1 = new Person("Kris", "De Cooman");
        Person p2 = new Person("Linde", "De Leu");
        Person p3 = new Person("Yannick", "Osselaer");

        // 2d array of 3 rows and 1 col
        Person[][] personArray = new Person[3][1];
        personArray[0][0] = p1;
        personArray[1][0] = p2;
        personArray[2][0] = p3;

        System.out.println("First persons name is " +  personArray[0][0].getFirstName());


        // Print the length of the array or how many rows it has
        System.out.println(personArray.length);

        // Print the length of the rows
        System.out.println(personArray[0].length);

        // Print out all persons firstname in the array in a loop
        for (int rows = 0; rows < personArray.length; rows++) { // 0 1 2
            for (int cols = 0; cols < personArray[cols].length; cols++) {
                System.out.println(personArray[rows][cols].getFirstName());
            }
        }


    }
}
