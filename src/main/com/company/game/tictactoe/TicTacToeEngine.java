package com.company.game.tictactoe;

import com.company.game.tictactoe.gameElement.Board;
import com.company.game.tictactoe.gameLogic.GameState;
import com.company.game.tictactoe.gameLogic.Judge;
import com.company.game.tictactoe.player.Player;

import java.util.ArrayList;

public class TicTacToeEngine {
    private ArrayList<Player> players = new ArrayList<Player>();
    private GameState state = new GameState(new Board(3,3));
    private Judge judge = new Judge(state.getBoard());

    TicTacToeEngine(Player playerOne, Player playerTwo) { // polimorfizm
        players.add(playerOne);
        players.add(playerTwo);
    }

    public void run() {
        int i = 0;
        while (!state.isGameOver()) {
            System.out.println("Gracz " + (i % 2 + 1) + ":");
            Player currentPlayer = players.get(i % 2);
            int playerMove = currentPlayer.makeMove(state.getBoard());

            if(!judge.isMoveValid(playerMove)) {
                System.out.println("Ruch nieprawidłowy");
                continue;
            }

            state.getBoard().put(
                playerMove,
                currentPlayer.getPiece()
            );
            judge.setBoard(state.getBoard());

            System.out.println(state.getBoard()); // JAVA sama wywoła funkcję toString()
            i++;
        }
        i--;
        if (state.isWon()) {
            System.out.print("Gracz " + (i % 2 + 1) + " wygrał!");
        } else if (state.isDraw()) {
            System.out.print("Remis.");
        }
    }
}




