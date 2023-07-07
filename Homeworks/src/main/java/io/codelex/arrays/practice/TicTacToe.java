package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {
    private static final char[][] board = new char[3][3];
    private static char player = 'X';

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        initBoard();
        displayBoard();

        int row;
        int col;
        boolean gameEnded = false;

        while (!gameEnded) {
            System.out.println("Player " + player + " enter your move (row 0, 1, 2): ");
            row = input.nextInt();
            System.out.println("Enter your move (col 0, 1, 2): ");
            col = input.nextInt();

            if (isValidMove(row, col)) {
                makeMove(row, col);

                if (checkWin()) {
                    System.out.println("Wins player: " + player);
                    gameEnded = true;
                } else if (boardIsFull()) {
                    System.out.println("It's a draw!");
                    gameEnded = true;
                } else {
                    if (player == 'X') {
                        player = 'O';
                    } else {
                        player = 'X';
                    }
                    displayBoard();
                }
            } else {
                System.out.println("Incorrect move.Try again.");
            }
        }
    }

    public static void initBoard() {
        // Fills up the board with blanks
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    public static void makeMove(int row, int col) {
        board[row][col] = player;
    }

    public static boolean checkWin() {

        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }


        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    public static boolean boardIsFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
