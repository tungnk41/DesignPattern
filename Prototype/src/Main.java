import Prototype.Cell;

import java.util.Arrays;

public class Main {

    public static void printBoard(Cell[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(" Board[" + i + "][" + j + "] " + board[i][j].getColor() + "  ,");
            }
            System.out.println();
        }
    }

    public static void initBoardWithoutPrototype(Cell[][] board){
        for(int row = 0; row< board.length;row++){
            for (int col = 0; col < board[0].length; col++) {
                if((row+col) %2 == 0){
                    board[row][col] = new Cell("White");
                }else{
                    board[row][col] = new Cell("Black");
                }
                board[row][col].setCoordinate(row+", "+col);
            }
        }
    }

    public static void initBoardWithPrototype(Cell[][] board){
        Cell cellWhite = new Cell("White");
        Cell cellBlack = new Cell("Black");

        for(int row = 0; row< board.length;row++){
            for (int col = 0; col < board[0].length; col++) {
                if((row+col) %2 == 0){
                    board[row][col] = cellWhite.clone();
                }else{
                    board[row][col] = cellBlack.clone();
                }
                board[row][col].setCoordinate(row+", "+col);
            }
        }
    }

    /*
    Prototype help create Item quickly
    if using prototype, board only need 88ms to create
    without prototype, board is created with 716ms
     */

    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();

        Cell[][] board = new Cell[8][8];

        int type = 1;

        if(type == 2){
            initBoardWithPrototype(board);
        }else{
            initBoardWithoutPrototype(board);
        }


        printBoard(board);

        long runtime = System.currentTimeMillis() - timeStart;
        System.out.println("Execution time : " + runtime);

    }
}
