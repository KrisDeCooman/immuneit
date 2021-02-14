package com.kdc.throwsexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Person {


    void a() throws FileNotFoundException {
        b();
    }

    private void b() throws FileNotFoundException {
        c();
    }

    private void c() throws FileNotFoundException {


            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                System.out.println(myReader.nextLine());
            }


    }
}
