package models;

import Strategy.BotPlayingStrategy;
import Strategy.EasyBotPlayingStrategy;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(char c, String name, BotDifficultyLevel botDifficultyLevel) {
        super(c, name, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
        // TODO: better way is via factory based on the bot difficulty level
        this.botPlayingStrategy = new EasyBotPlayingStrategy();
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public Move decideMove(Board board) {
        return botPlayingStrategy.decideMove(this, board);
    }

}
