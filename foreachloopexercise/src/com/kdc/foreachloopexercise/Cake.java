package com.kdc.foreachloopexercise;

import java.util.ArrayList;

public class Cake {

    private ArrayList<Piece> pieces;

    public Cake(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
