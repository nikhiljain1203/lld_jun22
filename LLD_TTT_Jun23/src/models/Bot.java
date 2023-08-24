package models;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(char c, String name, BotDifficultyLevel botDifficultyLevel) {
        super(c, name, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

}
