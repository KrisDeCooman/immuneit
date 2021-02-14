package com.kdc.abstractvsinterface;

import java.util.ArrayList;

public class Raiden extends Character implements IWeapons{

    private ArrayList<Weapon> weapons;

    public Raiden(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    @Override
    public void finisher() {
        System.out.println("Fatality : Alternating Current");
    }

    @Override
    public void music() {
        System.out.println("Playing Raiden soundtrack");
    }

    @Override
    public ArrayList<Weapon> favouriteWeapons() {
        return weapons;
    }

    @Override
    public String toString() {
        return "Fight with  : Raiden{" +
                "weapons=" + weapons +
                '}';
    }
}
