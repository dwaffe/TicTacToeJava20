package com.company.game.tictactoe;

import com.company.game.tictactoe.gameElement.Board;
import com.company.game.tictactoe.gameElement.Piece;
import com.company.game.tictactoe.gameLogic.GameState;
import com.company.game.tictactoe.player.Player;

import java.util.ArrayList;

public class TicTacToeEngine {
    private ArrayList<Player> players = new ArrayList<Player>();
    private GameState state = new GameState(new Board(3,3));

    TicTacToeEngine(Player playerOne, Player playerTwo) {
        players.add(playerOne);
        players.add(playerTwo);
    }

    public void run() {
        int i = 0;
        while (!state.isGameOver()) {

            Player currentPlayer = players.get(i % 2);

            state.getBoard().put(
                    currentPlayer.makeMove(),
                    currentPlayer.getPiece()
                    );
            System.out.println();
            i++;
        }
    }

    @Override
    public String toString() {
        return "TODO!";
    }
}
