package com.kdc.abstractvsinterface;

import java.util.ArrayList;

public class SubZero extends Character implements IWeapons {

    private ArrayList<Weapon> weapons;

    public SubZero(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    @Override
    public void finisher() {
        System.out.println("Fatality : Ice-cutioner!");
    }

    @Override
    public void music() {
        System.out.println("Playing Sub-Zero soundtrack");
    }

    @Override
    public ArrayList<Weapon> favouriteWeapons() {
        return weapons;
    }

    @Override
    public String toString() {
        return "Fight with : SubZero{" +
                "weapons=" + weapons +
                '}';
    }
}
