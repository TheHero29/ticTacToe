package Models;

public class Bot extends Player{
    BotDifficultyLevel difficulty;
    public Bot(String name, Symbol symbol, PlayerType playerType,BotDifficultyLevel difficulty) {
        super(name, symbol, playerType);
        this.difficulty = difficulty;
    }
}
