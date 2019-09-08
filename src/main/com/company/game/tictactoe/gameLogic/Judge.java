package com.company.game.tictactoe.gameLogic;

import com.company.game.tictactoe.gameElement.Board;

public class Judge {
    private Board board;

    public Judge(Board board) {
        this.board = board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public boolean isMoveValid(int moveToValidate) {
        try {
            if (board.get(moveToValidate) == null) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }

        return false;
    }
}
