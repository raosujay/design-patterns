package LLD3;

import java.util.Scanner;

import java.util.Random;

class Board {
    private char[][] board;

    public Board() {
        board = new char[3][3];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean makeMove(int row, int col, char currentPlayer) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    public boolean checkWin(char currentPlayer) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}

class TicTacToeGame {
    private Board board;
    private char currentPlayer;
    private char botPlayer;

    public TicTacToeGame() {
        board = new Board();
        currentPlayer = 'X';
        botPlayer = 'O';
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            board.printBoard();
            if (currentPlayer == botPlayer) {
                makeBotMove();
            } else {
                System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
                int row = scanner.nextInt();
                int col = scanner.nextInt();

                if (board.makeMove(row, col, currentPlayer)) {
                    if (board.checkWin(currentPlayer)) {
                        board.printBoard();
                        System.out.println("Player " + currentPlayer + " wins!");
                        break;
                    } else if (board.isBoardFull()) {
                        board.printBoard();
                        System.out.println("It's a tie!");
                        break;
                    }
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }
        }
        scanner.close();
    }

    private void makeBotMove() {
        Random random = new Random();
        int row, col;

        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (!board.makeMove(row, col, botPlayer));

        if (board.checkWin(botPlayer)) {
            board.printBoard();
            System.out.println("Bot wins!");
        } else if (board.isBoardFull()) {
            board.printBoard();
            System.out.println("It's a tie!");
        }

        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.playGame();
    }
}
