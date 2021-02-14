package com.kdc.foreachloopexercise;

import java.util.ArrayList;

public class DemoClass {

    public static void main(String[] args) {


        ArrayList<Piece> piecesList = new ArrayList<>();
        piecesList.add(new Piece("Chocolate"));
        piecesList.add(new Piece("Vanilla"));
        piecesList.add(new Piece("Strawberry"));
        piecesList.add(new Piece("Banana"));
        piecesList.add(new Piece("Blueberry"));
        piecesList.add(new Piece("Apple"));

        Cake cake = new Cake(piecesList);

        for(Piece p : cake.getPieces()) {

            System.out.println("Eating a piece of cake with flavor :" + p.getTaste());

        }

        System.out.println("All done!");
    }
}
