package com.company.game.tictactoe.player;

import java.util.Scanner;

public class HumanPlayer extends Player {
    Scanner scan = new Scanner(System.in);

    @Override
    public int makeMove() {
        return scan.nextInt();
    }
}
