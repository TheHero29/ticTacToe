package Models;

import java.util.List;

public class Game {
    List<Player> players;
    Board board;
    int nextPlayerMoveIndex;
    Player winner;
    List<Move> moves;
    GameState state;

}
