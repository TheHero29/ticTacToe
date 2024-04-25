package org.example.controllers;

import org.example.exceptions.SameSymbolException;
import org.example.exceptions.InvalidMoveException;
import org.example.models.Game;
import org.example.models.GameState;
import org.example.models.Player;
import org.example.models.Symbol;

import java.util.HashSet;
import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players) {
        HashSet<Symbol> set = new HashSet<>();
        for(int i=0; i<players.size(); i++) {
            set.add(players.get(i).getSymbol());
        }
        if(set.size()!=players.size())
            throw new SameSymbolException("Some players have taken the same symbol, please take unique symbols!");
        return new Game(dimension, players);
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }
}
