package com.company.game.tictactoe.player;

import com.company.game.tictactoe.gameElement.Board;

import java.util.Scanner;

public class HumanPlayer extends Player {
    Scanner scan = new Scanner(System.in);

    @Override
    public int makeMove(Board board) {
        return scan.nextInt();
    }
}
