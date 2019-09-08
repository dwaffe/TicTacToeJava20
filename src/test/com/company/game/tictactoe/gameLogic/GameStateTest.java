package com.company.game.tictactoe.gameLogic;

import com.company.game.tictactoe.gameElement.Board;
import com.company.game.tictactoe.gameElement.OPiece;
import com.company.game.tictactoe.gameElement.Piece;
import com.company.game.tictactoe.gameElement.XPiece;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameStateTest {
    Board board;
    Piece xPiece = new XPiece();
    Piece oPiece = new OPiece();

    @BeforeEach
    void setUp() {
        board = new Board(3, 3);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testIsDraw() {
        board.put(1, xPiece);
        board.put(2, oPiece);
        board.put(3, xPiece);
        board.put(4, xPiece);
        board.put(5, oPiece);
        board.put(6, oPiece);
        board.put(7, oPiece);
        board.put(8, xPiece);
        board.put(9, xPiece);

        GameState state = new GameState(board);
        assertTrue(state.isDraw());
    }

    @Test
    void testIsNotDraw() {
        board.put(1, xPiece);
        board.put(2, xPiece);
        board.put(3, xPiece);
        board.put(4, xPiece);
        board.put(5, oPiece);
        board.put(6, oPiece);
        board.put(7, oPiece);
        board.put(8, xPiece);
        board.put(9, xPiece);

        GameState state = new GameState(board);
        assertFalse(state.isDraw());
    }
}



