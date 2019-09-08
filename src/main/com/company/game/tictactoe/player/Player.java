package com.company.game.tictactoe.player;

import com.company.game.tictactoe.gameElement.Board;
import com.company.game.tictactoe.gameElement.Piece;

public abstract class Player {
    private Piece piece;

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public abstract int makeMove(Board board);
}
