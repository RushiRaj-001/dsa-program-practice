package BackTracking;

public class nQueens {

    private static int solution = 0;

    public static boolean isSafe(char board[][], int row, int col) {

        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // left diagonaly
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }

        }

        // right diagonaly
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean nqueen(char board[][], int row) {

        if (row == board.length) {
            // printBoard(board);
            solution++;
            return true;
            // return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nqueen(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'x';
            }
        }

        return false;
        // printBoard(board);
    }

    public static void printBoard(char board[][]) {

        System.out.print("------------chess board---------");
        System.out.println(" solution : " + solution);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        if (nqueen(board, 0)) {
            printBoard(board);
        }
        System.out.println(" total solution : " + solution);
    }
}
