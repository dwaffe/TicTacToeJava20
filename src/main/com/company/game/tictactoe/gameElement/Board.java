package com.company.game.tictactoe.gameElement;

public class Board {
    private Piece[][] board; // używamy polimorfizmu bo klasy XPiece i OPiece dziedziczą po Piece


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

    @Override
    public String toString() {
        String result = "";
        int counter = 1;
        for (int x=0; x < board.length; x++) {
            for (int y=0; y < board[x].length; y++) {
                result += "[";
                if (board[x][y] == null) {
                    result += counter ;
                } else {
                    result += board[x][y];
                }
                result += "]";

                counter++;
            }
            result += "\n";
        }

        return result;
    }

    public Piece get(int fieldIndex) throws Exception {
        int counter = 1;

        mainLoop:
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (fieldIndex == counter) {
                    return board[x][y];
                }
                counter++;
            }
        }

        throw new Exception("Filed doesn't exist");
    }
}







