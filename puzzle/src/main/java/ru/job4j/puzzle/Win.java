package ru.job4j.puzzle;

public class Win {
    public static boolean vMethod(int[][] board, int j) {
        for(int i = 0; i < board.length; i++) {
            if(board[i][j] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean gMethod(int[][] board, int j) {
        for (int i = 0; i < board.length; i++) {
            if (board[j][i] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean check(int[][] board) {
        //boolean rsl = false;
        for(int i = 0; i < board.length; i++) {
            if(board[i][i] == 1 && (vMethod(board, i) || gMethod(board, i)) ) {
                return true;
            }
        }
        return false;
    }

}
