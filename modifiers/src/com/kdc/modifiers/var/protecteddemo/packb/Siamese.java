package com.kdc.modifiers.var.protecteddemo.packb;

import com.kdc.modifiers.var.protecteddemo.packa.Cat;

public class Siamese extends Cat{

    public static void main(String[] args) {

        /* Does not work

        Cat catObj = new Cat();
        System.out.println(catObj.age);
         */

        /* Does not work using polymorphism
        Cat catObj = new Siamese();
        Syste.out.println(catObj.age);
         */

        // Does work
        Siamese catObj = new Siamese();
        System.out.println(catObj.age);
        System.out.println(catObj.name);



    }
}
