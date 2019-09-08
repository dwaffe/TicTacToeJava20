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
        if (isWon()) {
            return false;
        }

        try {
            for (int i = 1; i < 10; i++) {
                if (board.get(i) == null) {
                    return false;
                }
            }
        } catch (Exception e) {
            System.out.println("Błąd w funkcji isDraw");
        }

        return true;
    }

    public boolean isWon() {
        return false;
    }
}


