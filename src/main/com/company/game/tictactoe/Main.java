package com.company.game.tictactoe;

import com.company.game.tictactoe.gameElement.OPiece;
import com.company.game.tictactoe.gameElement.XPiece;
import com.company.game.tictactoe.player.AIPlayer;
import com.company.game.tictactoe.player.HumanPlayer;
import com.company.game.tictactoe.player.Player;

public class Main {
    final static String NEW_GAME_WITH_HUMAN = "Graj z człowiekiem";
    final static String NEW_GAME_WITH_AI = "Graj z AI";

    public static void main(String[] args) {
        Menu menu = new Menu(
                NEW_GAME_WITH_AI,
                NEW_GAME_WITH_HUMAN
        );

        Player playerOne = new AIPlayer();
        Player playerTwo = new AIPlayer();

        switch (menu.printMenuAndGetChoice()) {
            case NEW_GAME_WITH_AI:
                playerOne = new HumanPlayer();
                playerOne.setPiece(new XPiece());

                playerTwo.setPiece(new OPiece());

                break;
            case NEW_GAME_WITH_HUMAN:
                System.out.println("Nowa gra z człowiekiem");
                playerOne = new HumanPlayer();
                playerOne.setPiece(new XPiece());

                playerTwo = new HumanPlayer();
                playerTwo.setPiece(new OPiece());

                break;
            default:
                System.out.println("Coś poszło nie tak");
        }

        TicTacToeEngine game = new TicTacToeEngine(playerOne, playerTwo);
        game.run();
    }
}
