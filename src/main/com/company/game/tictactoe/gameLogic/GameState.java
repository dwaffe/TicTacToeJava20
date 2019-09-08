package com.company.game.tictactoe.gameLogic;

import com.company.game.tictactoe.gameElement.Board;

public class GameState {
    private Board board;

    public GameState(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public boolean isGameOver() {
        if (isWon() || isDraw()) {
            return true;
        }

        return false;
    }

    public boolean isDraw() {
        return false;
    }

    public boolean isWon() {
        return false;
    }
}
