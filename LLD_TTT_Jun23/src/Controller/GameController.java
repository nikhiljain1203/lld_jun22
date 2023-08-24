package Controller;

import models.Game;
import models.GameStatus;
import models.Player;

import java.util.List;

public class GameController {
    public Game createGame(int dimension, List<Player> players) {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .build();
    }

    public GameStatus getGameStatus(Game game) {
        return game.getGameStatus();
    }

    public String getWinnerName(Game game) {
        return game.getWinningPlayer().getName();
    }
    public void setGameStatus(Game game, GameStatus gameStatus) {
        game.setGameStatus(gameStatus);
    }
}
