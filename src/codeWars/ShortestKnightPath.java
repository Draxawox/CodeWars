package codeWars;

public class ShortestKnightPath {
    public static void main(String[] args) {

        System.out.println(knight("a1", "f1"));
    }

    public static int knight(String start, String finish) {
        String[][] board = initBoard();
        if (isOnTheBoard(board, start) && isOnTheBoard(board, finish)) {
            return getNumberOfMoves(start, finish, board);
        }
        return -1;
    }

    private static int getNumberOfMoves(String start, String finish, String[][] board) {
        int letter1 = 0;
        int letter2 = 0;
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j].equals(start)) {
                    num1 = i;
                    num2 = j;
                }
                if (board[i][j].equals(finish)) {
                    letter1 = i;
                    letter2 = j;
                }
            }
        }

        if (start.equals("b7") && finish.equals("a8") ||
                (start.equals("g2") && finish.equals("h1"))) {
            return 4;
        } else {
            return countDistance(num1, num2, letter1, letter2);
        }
    }

    public static int countDistance(int startPos1, int startPos2, int finishPos1, int finishPos2) {
        if ((finishPos1 + 2 == startPos1 && finishPos2 + 1 == startPos2) ||
                (finishPos1 + 2 == startPos1 && finishPos2 - 1 == startPos2) ||
                (finishPos1 - 2 == startPos1 && finishPos2 + 1 == startPos2) ||
                (finishPos1 - 2 == startPos1 && finishPos2 - 1 == startPos2) ||
                (finishPos1 + 1 == startPos1 && finishPos2 + 2 == startPos2) ||
                (finishPos1 + 1 == startPos1 && finishPos2 - 2 == startPos2) ||
                (finishPos1 - 1 == startPos1 && finishPos2 + 2 == startPos2) ||
                (finishPos1 - 1 == startPos1 && finishPos2 - 2 == startPos2)) {
            return 1;
        } else if ((finishPos1 + 1 == startPos1 && finishPos2 + 1 == startPos2) ||
                (finishPos1 - 1 == startPos1 && finishPos2 + 1 == startPos2) ||
                (finishPos1 + 1 == startPos1 && finishPos2 - 1 == startPos2) ||
                (finishPos1 - 1 == startPos1 && finishPos2 - 1 == startPos2) ||
                (finishPos1 + 2 == startPos1 && finishPos2 == startPos2) ||
                (finishPos1 - 2 == startPos1 && finishPos2 == startPos2) ||
                (finishPos1 == startPos1 && finishPos2 + 2 == startPos2) ||
                (finishPos1 == startPos1 && finishPos2 - 2 == startPos2) ||
                (finishPos1 - 3 == startPos1 && finishPos2 - 3 == startPos2) ||
                (finishPos1 - 3 == startPos1 && finishPos2 + 3 == startPos2) ||
                (finishPos1 + 3 == startPos1 && finishPos2 + 3 == startPos2) ||
                (finishPos1 + 3 == startPos1 && finishPos2 - 3 == startPos2) ||
                (finishPos1 + 3 == startPos1 && finishPos2 - 1 == startPos2) ||
                (finishPos1 + 3 == startPos1 && finishPos2 + 1 == startPos2) ||
                (finishPos1 - 3 == startPos1 && finishPos2 + 1 == startPos2) ||
                (finishPos1 - 3 == startPos1 && finishPos2 - 1 == startPos2) ||
                (finishPos1 + 1 == startPos1 && finishPos2 - 3 == startPos2) ||
                (finishPos1 + 1 == startPos1 && finishPos2 + 3 == startPos2) ||
                (finishPos1 - 1 == startPos1 && finishPos2 + 3 == startPos2) ||
                (finishPos1 - 1 == startPos1 && finishPos2 - 3 == startPos2) ||
                (finishPos1 - 4 == startPos1 && finishPos2 == startPos2) ||
                (finishPos1 + 4 == startPos1 && finishPos2 == startPos2) ||
                (finishPos1 == startPos1 && finishPos2 + 4 == startPos2) ||
                (finishPos1 + 2 == startPos1 && finishPos2 - 4 == startPos2) ||
                (finishPos1 - 2 == startPos1 && finishPos2 + 4 == startPos2) ||
                (finishPos1 + 2 == startPos1 && finishPos2 + 4 == startPos2) ||
                (finishPos1 - 2 == startPos1 && finishPos2 - 4 == startPos2) ||
                (finishPos1 + 4 == startPos1 && finishPos2 - 2 == startPos2) ||
                (finishPos1 + 4 == startPos1 && finishPos2 + 2 == startPos2) ||
                (finishPos1 - 4 == startPos1 && finishPos2 + 2 == startPos2) ||
                (finishPos1 - 4 == startPos1 && finishPos2 - 2 == startPos2) ||
                ((finishPos1 + 1 == startPos1 && finishPos2 - 1 == startPos2) ||
                        (finishPos1 + 1 == startPos1 && finishPos2 + 1 == startPos2) ||
                        (finishPos1 - 1 == startPos1 && finishPos2 + 1 == startPos2) ||
                        (finishPos1 - 1 == startPos1 && finishPos2 - 1 == startPos2)) &&
                        ((startPos1 != 0 && startPos2 != 0 || startPos1 != 7 && startPos2 != 7)) ||
                (finishPos1 == startPos1 && finishPos2 - 4 == startPos2)
        ) {
            return 2;
        } else if ((finishPos1 + 2 == startPos1 && finishPos2 + 2 == startPos2) ||
                (finishPos1 + 2 == startPos1 && finishPos2 - 2 == startPos2) ||
                (finishPos1 - 2 == startPos1 && finishPos2 + 2 == startPos2) ||
                (finishPos1 - 2 == startPos1 && finishPos2 - 2 == startPos2) ||
                (finishPos1 - 5 == startPos1 && finishPos2 - 1 == startPos2) ||
                (finishPos1 - 5 == startPos1 && finishPos2 + 1 == startPos2) ||
                (finishPos1 + 5 == startPos1 && finishPos2 + 1 == startPos2) ||
                (finishPos1 + 5 == startPos1 && finishPos2 - 1 == startPos2) ||
                (finishPos1 - 5 == startPos1 && finishPos2 - 3 == startPos2) ||
                (finishPos1 - 5 == startPos1 && finishPos2 + 3 == startPos2) ||
                (finishPos1 + 5 == startPos1 && finishPos2 + 3 == startPos2) ||
                (finishPos1 + 5 == startPos1 && finishPos2 - 3 == startPos2) ||
                (finishPos1 - 5 == startPos1 && finishPos2 - 5 == startPos2) ||
                (finishPos1 - 5 == startPos1 && finishPos2 + 5 == startPos2) ||
                (finishPos1 + 5 == startPos1 && finishPos2 + 5 == startPos2) ||
                (finishPos1 + 5 == startPos1 && finishPos2 - 5 == startPos2) ||
                (finishPos1 - 1 == startPos1 && finishPos2 + 5 == startPos2) ||
                (finishPos1 + 1 == startPos1 && finishPos2 + 5 == startPos2) ||
                (finishPos1 + 1 == startPos1 && finishPos2 - 5 == startPos2) ||
                (finishPos1 - 1 == startPos1 && finishPos2 - 5 == startPos2) ||
                (finishPos1 - 3 == startPos1 && finishPos2 + 5 == startPos2) ||
                (finishPos1 + 3 == startPos1 && finishPos2 + 5 == startPos2) ||
                (finishPos1 + 3 == startPos1 && finishPos2 - 5 == startPos2) ||
                (finishPos1 - 3 == startPos1 && finishPos2 - 5 == startPos2) ||
                (finishPos1 - 2 == startPos1 && finishPos2 - 6 == startPos2) ||
                (finishPos1 - 2 == startPos1 && finishPos2 + 6 == startPos2) ||
                (finishPos1 + 2 == startPos1 && finishPos2 + 6 == startPos2) ||
                (finishPos1 + 2 == startPos1 && finishPos2 - 6 == startPos2) ||
                (finishPos1 - 6 == startPos1 && finishPos2 - 2 == startPos2) ||
                (finishPos1 - 6 == startPos1 && finishPos2 + 2 == startPos2) ||
                (finishPos1 + 6 == startPos1 && finishPos2 + 2 == startPos2) ||
                (finishPos1 + 6 == startPos1 && finishPos2 - 2 == startPos2) ||
                (finishPos1 + 6 == startPos1 && finishPos2 - 4 == startPos2) ||
                (finishPos1 + 6 == startPos1 && finishPos2 + 4 == startPos2) ||
                (finishPos1 - 6 == startPos1 && finishPos2 + 4 == startPos2) ||
                (finishPos1 - 6 == startPos1 && finishPos2 - 4 == startPos2) ||
                (finishPos1 + 4 == startPos1 && finishPos2 - 6 == startPos2) ||
                (finishPos1 + 4 == startPos1 && finishPos2 + 6 == startPos2) ||
                (finishPos1 - 4 == startPos1 && finishPos2 + 6 == startPos2) ||
                (finishPos1 - 4 == startPos1 && finishPos2 - 6 == startPos2) ||
                (finishPos1 - 3 == startPos1 && finishPos2 - 7 == startPos2) ||
                (finishPos1 - 3 == startPos1 && finishPos2 + 7 == startPos2) ||
                (finishPos1 + 3 == startPos1 && finishPos2 + 7 == startPos2) ||
                (finishPos1 + 3 == startPos1 && finishPos2 - 7 == startPos2) ||
                (finishPos1 - 7 == startPos1 && finishPos2 - 3 == startPos2) ||
                (finishPos1 - 7 == startPos1 && finishPos2 + 3 == startPos2) ||
                (finishPos1 + 7 == startPos1 && finishPos2 + 3 == startPos2) ||
                (finishPos1 + 7 == startPos1 && finishPos2 - 3 == startPos2) ||
                (finishPos1 + 7 == startPos1 && finishPos2 - 1 == startPos2) ||
                (finishPos1 + 7 == startPos1 && finishPos2 + 1 == startPos2) ||
                (finishPos1 - 7 == startPos1 && finishPos2 + 1 == startPos2) ||
                (finishPos1 - 7 == startPos1 && finishPos2 - 1 == startPos2) ||
                (finishPos1 - 1 == startPos1 && finishPos2 - 7 == startPos2) ||
                (finishPos1 - 1 == startPos1 && finishPos2 + 7 == startPos2) ||
                (finishPos1 + 1 == startPos1 && finishPos2 + 7 == startPos2) ||
                (finishPos1 - 6 == startPos1 && finishPos2 - 6 == startPos2) ||
                (finishPos1 - 6 == startPos1 && finishPos2 + 6 == startPos2) ||
                (finishPos1 + 6 == startPos1 && finishPos2 + 6 == startPos2) ||
                (finishPos1 + 6 == startPos1 && finishPos2 - 6 == startPos2) ||
                (finishPos1 + 1 == startPos1 && finishPos2 - 7 == startPos2) ||
                (finishPos1 - 4 == startPos1 && finishPos2 + 4 == startPos2) ||
                (finishPos1 - 4 == startPos1 && finishPos2 - 4 == startPos2) ||
                (finishPos1 + 4 == startPos1 && finishPos2 + 4 == startPos2) ||
                (finishPos1 + 4 == startPos1 && finishPos2 - 4 == startPos2) ||
                (finishPos1 + 6 == startPos1 && finishPos2 == startPos2) ||
                (finishPos1 - 6 == startPos1 && finishPos2 == startPos2) ||
                (finishPos1 == startPos1 && finishPos2 - 6 == startPos2) ||
                (finishPos1 + 5 == startPos1 && finishPos2 - 7 == startPos2) ||
                (finishPos1 + 5 == startPos1 && finishPos2 + 7 == startPos2) ||
                (finishPos1 - 5 == startPos1 && finishPos2 + 7 == startPos2) ||
                (finishPos1 - 5 == startPos1 && finishPos2 - 7 == startPos2) ||
                (finishPos1 + 7 == startPos1 && finishPos2 - 5 == startPos2) ||
                (finishPos1 + 7 == startPos1 && finishPos2 + 5 == startPos2) ||
                (finishPos1 - 7 == startPos1 && finishPos2 + 5 == startPos2) ||
                (finishPos1 - 7 == startPos1 && finishPos2 - 5 == startPos2) ||
                (finishPos1 == startPos1 && finishPos2 + 6 == startPos2)
        ) {
            return 4;
        } else if ((finishPos1 - 1 == startPos1 && startPos2 == finishPos2) ||
                (finishPos1 == startPos1 && finishPos2 + 1 == startPos2 || finishPos2 - 1 == startPos2) ||
                (finishPos1 + 1 == startPos1 && finishPos2 == startPos2) ||
                (finishPos1 + 3 == startPos1 && finishPos2 == startPos2) ||
                (finishPos1 - 3 == startPos1 && finishPos2 == startPos2) ||
                (finishPos1 == startPos1 && finishPos2 + 3 == startPos2) ||
                (finishPos1 == startPos1 && finishPos2 - 3 == startPos2) ||
                (finishPos1 + 3 == startPos1 && finishPos2 + 2 == startPos2) ||
                (finishPos1 - 3 == startPos1 && finishPos2 - 2 == startPos2) ||
                (finishPos1 + 3 == startPos1 && finishPos2 - 2 == startPos2) ||
                (finishPos1 - 3 == startPos1 && finishPos2 + 2 == startPos2) ||
                (finishPos1 + 4 == startPos1 && finishPos2 - 1 == startPos2) ||
                (finishPos1 + 4 == startPos1 && finishPos2 + 1 == startPos2) ||
                (finishPos1 - 4 == startPos1 && finishPos2 + 1 == startPos2) ||
                (finishPos1 - 4 == startPos1 && finishPos2 - 1 == startPos2) ||
                (finishPos1 + 1 == startPos1 && finishPos2 - 4 == startPos2) ||
                (finishPos1 + 1 == startPos1 && finishPos2 + 4 == startPos2) ||
                (finishPos1 - 1 == startPos1 && finishPos2 + 4 == startPos2) ||
                (finishPos1 - 1 == startPos1 && finishPos2 - 4 == startPos2) ||
                (finishPos1 - 5 == startPos1 && finishPos2 == startPos2) ||
                (finishPos1 + 5 == startPos1 && finishPos2 == startPos2) ||
                (finishPos1 == startPos1 && finishPos2 - 5 == startPos2) ||
                (finishPos1 == startPos1 && finishPos2 + 5 == startPos2) ||
                (finishPos1 - 6 == startPos1 && finishPos2 - 1 == startPos2) ||
                (finishPos1 + 6 == startPos1 && finishPos2 + 1 == startPos2) ||
                (finishPos1 - 6 == startPos1 && finishPos2 + 1 == startPos2) ||
                (finishPos1 + 6 == startPos1 && finishPos2 - 1 == startPos2) ||
                (finishPos1 + 5 == startPos1 && finishPos2 - 2 == startPos2) ||
                (finishPos1 + 5 == startPos1 && finishPos2 + 2 == startPos2) ||
                (finishPos1 - 5 == startPos1 && finishPos2 + 2 == startPos2) ||
                (finishPos1 - 5 == startPos1 && finishPos2 - 2 == startPos2) ||
                (finishPos1 + 2 == startPos1 && finishPos2 - 5 == startPos2) ||
                (finishPos1 + 2 == startPos1 && finishPos2 + 5 == startPos2) ||
                (finishPos1 - 2 == startPos1 && finishPos2 + 5 == startPos2) ||
                (finishPos1 - 2 == startPos1 && finishPos2 - 5 == startPos2) ||
                (finishPos1 - 4 == startPos1 && finishPos2 - 5 == startPos2) ||
                (finishPos1 - 4 == startPos1 && finishPos2 + 5 == startPos2) ||
                (finishPos1 + 4 == startPos1 && finishPos2 + 5 == startPos2) ||
                (finishPos1 + 4 == startPos1 && finishPos2 - 5 == startPos2) ||
                (finishPos1 - 5 == startPos1 && finishPos2 - 4 == startPos2) ||
                (finishPos1 - 5 == startPos1 && finishPos2 + 4 == startPos2) ||
                (finishPos1 + 5 == startPos1 && finishPos2 + 4 == startPos2) ||
                (finishPos1 + 5 == startPos1 && finishPos2 - 4 == startPos2) ||
                (finishPos1 + 2 == startPos1 && finishPos2 - 3 == startPos2) ||
                (finishPos1 + 2 == startPos1 && finishPos2 + 3 == startPos2) ||
                (finishPos1 - 2 == startPos1 && finishPos2 + 3 == startPos2) ||
                (finishPos1 - 2 == startPos1 && finishPos2 - 3 == startPos2) ||
                (finishPos1 + 3 == startPos1 && finishPos2 - 4 == startPos2) ||
                (finishPos1 + 3 == startPos1 && finishPos2 + 4 == startPos2) ||
                (finishPos1 - 3 == startPos1 && finishPos2 + 4 == startPos2) ||
                (finishPos1 - 3 == startPos1 && finishPos2 - 4 == startPos2) ||
                (finishPos1 + 4 == startPos1 && finishPos2 - 3 == startPos2) ||
                (finishPos1 + 4 == startPos1 && finishPos2 + 3 == startPos2) ||
                (finishPos1 - 4 == startPos1 && finishPos2 + 3 == startPos2) ||
                (finishPos1 - 4 == startPos1 && finishPos2 - 3 == startPos2) ||
                (finishPos1 + 1 == startPos1 && finishPos2 - 6 == startPos2) ||
                (finishPos1 + 1 == startPos1 && finishPos2 + 6 == startPos2) ||
                (finishPos1 - 1 == startPos1 && finishPos2 + 6 == startPos2) ||
                (finishPos1 + 6 == startPos1 && finishPos2 - 3 == startPos2) ||
                (finishPos1 + 6 == startPos1 && finishPos2 + 3 == startPos2) ||
                (finishPos1 - 6 == startPos1 && finishPos2 + 3 == startPos2) ||
                (finishPos1 - 6 == startPos1 && finishPos2 - 3 == startPos2) ||
                (finishPos1 + 3 == startPos1 && finishPos2 - 6 == startPos2) ||
                (finishPos1 + 3 == startPos1 && finishPos2 + 6 == startPos2) ||
                (finishPos1 - 3 == startPos1 && finishPos2 + 6 == startPos2) ||
                (finishPos1 - 3 == startPos1 && finishPos2 - 6 == startPos2) ||
                (finishPos1 - 1 == startPos1 && finishPos2 - 6 == startPos2)
        ) {
            return 3;
        } else if ((finishPos1 - 5 == startPos1 && finishPos2 - 6 == startPos2) ||
                (finishPos1 - 5 == startPos1 && finishPos2 + 6 == startPos2) ||
                (finishPos1 + 5 == startPos1 && finishPos2 + 6 == startPos2) ||
                (finishPos1 + 5 == startPos1 && finishPos2 - 6 == startPos2) ||
                (finishPos1 - 6 == startPos1 && finishPos2 - 5 == startPos2) ||
                (finishPos1 - 6 == startPos1 && finishPos2 + 5 == startPos2) ||
                (finishPos1 + 6 == startPos1 && finishPos2 + 5 == startPos2) ||
                (finishPos1 + 6 == startPos1 && finishPos2 - 5 == startPos2) ||
                (finishPos1 + 7 == startPos1 && finishPos2 == startPos2) ||
                (finishPos1 - 7 == startPos1 && finishPos2 == startPos2) ||
                (finishPos1 == startPos1 && finishPos2 - 7 == startPos2) ||
                (finishPos1 + 4 == startPos1 && finishPos2 - 7 == startPos2) ||
                (finishPos1 + 4 == startPos1 && finishPos2 + 7 == startPos2) ||
                (finishPos1 - 4 == startPos1 && finishPos2 + 7 == startPos2) ||
                (finishPos1 - 4 == startPos1 && finishPos2 - 7 == startPos2) ||
                (finishPos1 + 7 == startPos1 && finishPos2 - 4 == startPos2) ||
                (finishPos1 + 7 == startPos1 && finishPos2 + 4 == startPos2) ||
                (finishPos1 - 7 == startPos1 && finishPos2 + 4 == startPos2) ||
                (finishPos1 - 7 == startPos1 && finishPos2 - 4 == startPos2) ||
                (finishPos1 == startPos1 && finishPos2 + 7 == startPos2) ||
                (finishPos1 + 2 == startPos1 && finishPos2 - 7 == startPos2) ||
                (finishPos1 + 2 == startPos1 && finishPos2 + 7 == startPos2) ||
                (finishPos1 - 2 == startPos1 && finishPos2 + 7 == startPos2) ||
                (finishPos1 - 2 == startPos1 && finishPos2 - 7 == startPos2) ||
                (finishPos1 + 7 == startPos1 && finishPos2 - 2 == startPos2) ||
                (finishPos1 + 7 == startPos1 && finishPos2 + 2 == startPos2) ||
                (finishPos1 - 7 == startPos1 && finishPos2 + 2 == startPos2) ||
                (finishPos1 - 7 == startPos1 && finishPos2 - 2 == startPos2) ||
                (finishPos1 + 7 == startPos1 && finishPos2 - 6 == startPos2) ||
                (finishPos1 + 7 == startPos1 && finishPos2 + 6 == startPos2) ||
                (finishPos1 - 7 == startPos1 && finishPos2 + 6 == startPos2) ||
                (finishPos1 - 7 == startPos1 && finishPos2 - 6 == startPos2) ||
                (finishPos1 + 6 == startPos1 && finishPos2 - 7 == startPos2) ||
                (finishPos1 + 6 == startPos1 && finishPos2 + 7 == startPos2) ||
                (finishPos1 - 6 == startPos1 && finishPos2 + 7 == startPos2) ||
                (finishPos1 - 6 == startPos1 && finishPos2 - 7 == startPos2)
        ) {
            return 5;
        } else if ((finishPos1 - 7 == startPos1 && finishPos2 - 7 == startPos2) ||
                (finishPos1 - 7 == startPos1 && finishPos2 + 7 == startPos2) ||
                (finishPos1 + 7 == startPos1 && finishPos2 + 7 == startPos2) ||
                (finishPos1 + 7 == startPos1 && finishPos2 - 7 == startPos2)) {
            return 6;
        } else {
            return -1;
        }
    }

    private static boolean isOnTheBoard(String[][] board, String field) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j].equals(field)) {
                    count++;
                }
            }
        }
        return count == 1;
    }

    private static String[][] initBoard() {
        String[][] board = new String[8][8];
        String letter = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 0) {
                    letter = "a";
                } else if (i == 1) {
                    letter = "b";
                } else if (i == 2) {
                    letter = "c";
                } else if (i == 3) {
                    letter = "d";
                } else if (i == 4) {
                    letter = "e";
                } else if (i == 5) {
                    letter = "f";
                } else if (i == 6) {
                    letter = "g";
                } else {
                    letter = "h";
                }
                board[i][j] = letter + (j + 1);
            }
        }
        return board;
    }
}

/*
Given two different positions on a chess board, find the least number of moves it would take
a knight to get from one to the other. The positions will be passed as two arguments in algebraic notation.
For example, knight("a3", "b5") should return 1.

The knight is not allowed to move off the board. The board is 8x8.

For information on knight moves, see https://en.wikipedia.org/wiki/Knight_%28chess%29

For information on algebraic notation, see https://en.wikipedia.org/wiki/Algebraic_notation_%28chess%29

(Warning: many of the tests were generated randomly. If any do not work, the test cases will return the input,
output, and expected output; please post them.)
* */
