package com.kdc.abstraction.right;

import java.util.ArrayList;

public class RepairShopDemo {

    public static void main(String[] args) {

        Phone iphone = new Iphone();
        Phone samsung = new SamsungS20();

        RepairShop repairShop = new RepairShop();

        ArrayList<Phone> phoneList = new ArrayList<>();
        phoneList.add(iphone);
        phoneList.add(samsung);

        for(Phone p : phoneList) {
            repairShop.repair(p);
        }

    }
}
