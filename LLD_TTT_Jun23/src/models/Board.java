package models;

import java.util.LinkedList;
import java.util.List;

public class Board {
    private int size;

    private List<List<Cell>> cells;

    /*
    -------
    \
    \
    \

    */

    public Board(int dimension) {
        this.size = dimension;
        this.cells = new LinkedList<>();
        for (int i = 0; i < dimension; i++) {
            this.cells.add(new LinkedList<>());
            for (int j = 0; j < dimension; j++) {
                this.cells.get(i).add(new Cell(i, j));
            }
        }
    }

    public List<List<Cell>> getBoard() {
        return cells;
    }

    public void setBoard(List<List<Cell>> cells) {
        this.cells = cells;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void displayBoard() {
        //Print the board.
        for (int i = 0; i < cells.size(); i++) {
            for (int j = 0; j < cells.size(); j++) {
                if (cells.get(i).get(j).getCellState()
                        .equals(CellState.EMPTY)) {
                    System.out.print("|  |");
                } else {
                    System.out.print("|" +
                            cells.get(i).get(j)
                                    .getPlayer().getSymbol() + "|");
                }
            }
            System.out.println();
        }
    }

    public void applyMove(Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        this.getBoard().get(row).get(col)
                .setCellState(CellState.FILLED);
        this.getBoard().get(row).get(col)
                .setPlayer(move.getPlayer());
    }
}
