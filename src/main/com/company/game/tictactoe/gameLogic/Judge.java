package com.company.game.tictactoe.gameLogic;

import com.company.game.tictactoe.gameElement.Board;

public class Judge {
    private Board board;
    private int[][] winningConditions = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9},
            {1, 5, 9},
            {7, 5, 3}
    };

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

    public boolean isWon() {
        try {
            for (int[] combination: winningConditions) {
                if (board.get(combination[0]) == null) {
                    continue;
                }
                if (board.get(combination[0]) == board.get(combination[1]) // tutaj zwracamy boolen dlatego potem dajemy &&
                        && board.get(combination[1]) == board.get(combination[2])) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: wrong combination");
        }

        return false;
    }
}

















