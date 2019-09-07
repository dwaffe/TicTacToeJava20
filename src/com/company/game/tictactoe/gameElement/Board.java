package com.company.game.tictactoe.gameElement;

public class Board {
    Piece[][] board;


    public Board(int xLength, int yLength) {
        board = new Piece[xLength][yLength];
    }

    public void put(int makeMove, Piece piece) {
        int counter = 1;

        mainLoop:
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (makeMove == counter) {
                    board[x][y] = piece;
                    break mainLoop;
                }
                counter++;
            }
        }
    }
}
