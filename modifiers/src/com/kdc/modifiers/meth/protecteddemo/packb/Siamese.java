package com.kdc.modifiers.meth.protecteddemo.packb;

import com.kdc.modifiers.meth.protecteddemo.packa.Cat;

public class Siamese extends Cat {

    public static void main(String[] args) {

        Cat catObj = new Siamese();
        // will not work
        //catObj.printInfo();

        Siamese siamese = new Siamese();
        siamese.printInfo();
    }
}
