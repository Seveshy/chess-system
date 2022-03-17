package application;

import bordergame.Board;
import bordergame.Position;
import chess.ChessMatch;

public class Program {
    public static void main(String[] args) {
        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
