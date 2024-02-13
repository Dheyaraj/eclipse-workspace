public class NQueen {
    static int N = 8;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[][] board = new int[N][N];

        System.out.println("Original Board is:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }

        if (!solveNQueens(board, 0)) {
            System.out.println("No solution found");
        } else {
            System.out.println("Solution board is:");
            printSolution(board);
        }

        long end = System.currentTimeMillis();
        double total = (end - start) / 1000.0;
        System.out.println("Total time taken is " + total + " seconds");
    }

    static void printSolution(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    static boolean solveNQueens(int[][] board, int col) {
        if (col == N) {
            return true;
        }
        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
                if (solveNQueens(board, col + 1)) {
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board, int row, int col) {
        for (int x = 0; x < col; x++) {
            if (board[row][x] == 1) {
                return false;
            }
        }
        for (int x = row, y = col; x >= 0 && y >= 0; x--, y--) {
            if (board[x][y] == 1) {
                return false;
            }
        }
        for (int x = row, y = col; x < N && y >= 0; x++, y--) {
            if (board[x][y] == 1) {
                return false;
            }
        }
        return true;
    }
}
