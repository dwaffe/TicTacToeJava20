package com.company.game.tictactoe;

import com.company.game.tictactoe.gameLogic.GameState;
import com.company.game.tictactoe.player.Player;

import java.util.ArrayList;

public class TicTacToeEngine {
    private ArrayList<Player> players = new ArrayList<Player>();
    private GameState state = new GameState();

    TicTacToeEngine(Player playerOne, Player playerTwo) {
        players.add(playerOne);
        players.add(playerTwo);
    }

    public void run() {
        while (!state.isGameOver()) {
            System.out.println(players.get(0).makeMove());
        }
    }
}
