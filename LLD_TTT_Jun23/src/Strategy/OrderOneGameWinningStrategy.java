package Strategy;

import models.Board;
import models.Move;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneGameWinningStrategy implements GameWinningStrategy {
    // every row - a hashmap of symbol vs count
    List<HashMap<Character, Integer>> rowSymbolCounts =
            new ArrayList<>();
    // every col - a hashmap of symbol vs count
    List<HashMap<Character, Integer>> colSymbolCounts =
            new ArrayList<>();

    // every diag - a hashmap of symbol vs count
    HashMap<Character, Integer> topLeftDiaganolSymbolCounts =
            new HashMap<>();
    HashMap<Character, Integer> topRightDiaganolSymbolCounts =
            new HashMap<>();


    public OrderOneGameWinningStrategy(int dimension) {
        for (int i = 0; i < dimension; i++) {
            rowSymbolCounts.add(new HashMap<>());
            colSymbolCounts.add(new HashMap<>());
        }
    }
    @Override
    public boolean checkWinner(Board board, Move move) {
        char symbol = move.getPlayer().getSymbol();
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        int dimension = board.getBoard().size();

        // updated the count
        if(!rowSymbolCounts.get(row).containsKey(symbol)) {
            rowSymbolCounts.get(row).put(symbol, 0);
        }
        rowSymbolCounts
                .get(row) // get row map
                .put(symbol, // update symbol in row map
                        rowSymbolCounts
                                .get(row)
                                .get(symbol) + 1);

        if (!colSymbolCounts.get(col).containsKey(symbol)) {
            colSymbolCounts.get(col).put(symbol, 0);
        }
        colSymbolCounts
                .get(col)
                .put(symbol,
                        colSymbolCounts
                                .get(col)
                                .get(symbol) + 1);

        if (row == col) {
            if (!topLeftDiaganolSymbolCounts.containsKey(symbol)) {
                topLeftDiaganolSymbolCounts.put(symbol, 0);
            }
            topLeftDiaganolSymbolCounts
                    .put(symbol,
                            topLeftDiaganolSymbolCounts
                                    .get(symbol) + 1);
        }

        if (row + col == dimension - 1) {
            if (!topRightDiaganolSymbolCounts.containsKey(symbol)) {
                topRightDiaganolSymbolCounts.put(symbol, 0);
            }
            topRightDiaganolSymbolCounts
                    .put(symbol,
                            topRightDiaganolSymbolCounts
                                    .get(symbol) + 1);
        }

        // check winner
        if(rowSymbolCounts.get(row).get(symbol) == dimension
                || colSymbolCounts.get(col).get(symbol) == dimension) {
            return true;
        }

        if(row == col && topLeftDiaganolSymbolCounts
                .get(symbol) == dimension) {
            return true;
        }

        if(row + col == dimension - 1 && topRightDiaganolSymbolCounts
                .get(symbol) == dimension) {
            return true;
        }

        return false;
    }
}
