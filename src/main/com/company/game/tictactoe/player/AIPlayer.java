package com.company.game.tictactoe.player;

import com.company.game.tictactoe.gameElement.Board;
import com.company.game.tictactoe.gameLogic.Judge;

import java.util.Random;

public class AIPlayer extends Player {
    Judge judge = new Judge(new Board(3, 3));

    @Override
    public int makeMove(Board board) {
        for (int i = 1; i < 10; i++) {
            Board newBoard = copyBoard(board);

            newBoard.put(i, this.getPiece()); // dziedziczymy z Player dlatego mamy dostęp do funkcji getPiece()
            judge.setBoard(newBoard);
            if (judge.isWon()) {
                return i;
            }
        }

        Random rand = new Random();
        return rand.nextInt(9) + 1;
    }

    private Board copyBoard(Board board) {
        Board newBoard = new Board(3,3);
        for (int i = 1; i < 10; i++) {
            try {
                newBoard.put(i, board.get(i));
            } catch (Exception e) {}
        }

        return newBoard;
    }
}
