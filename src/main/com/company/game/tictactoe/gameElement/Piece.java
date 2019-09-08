package com.company.game.tictactoe.gameElement;

public abstract class Piece {
    protected String sign;

    @Override
    public String toString() {
        return sign;
    }
}
