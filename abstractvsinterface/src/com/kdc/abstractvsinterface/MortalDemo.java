package com.kdc.abstractvsinterface;

import java.util.ArrayList;

public class MortalDemo {

    public static void main(String[] args) {

        ArrayList<Weapon> weaponsList1 = new ArrayList<>();
        weaponsList1.add(new Weapon("Knife"));
        weaponsList1.add(new Weapon("Axe"));
        weaponsList1.add(new Weapon("Gun"));

        ArrayList<Weapon> weaponsList2 = new ArrayList<>();
        weaponsList2.add(new Weapon("Machete"));
        weaponsList2.add(new Weapon("Shotgun"));
        weaponsList2.add(new Weapon("Grenade"));



        Character firstCharacter = new SubZero(weaponsList1);
        Character secondCharacter = new Raiden(weaponsList2);


        System.out.println(firstCharacter);
        System.out.println(secondCharacter);
    }
}
