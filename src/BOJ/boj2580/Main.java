package BOJ.boj2580;

import java.util.Scanner;

public class Main {
    public static int[][] board = new int[9][9];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        sudoku(0, 0);

    }

    private static void sudoku(int x, int y) {

        if (y == 9) {
            sudoku(x + 1, 0);
            return;
        }

        if (x == 9) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(board[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
            System.exit(0);
        }


        if (board[x][y] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (possible(x, y, i)) {
                    board[x][y] = i;
                    sudoku(x, y + 1); // y가 9가 되면 x+1, 0 으로, x가 9가 되면 종료
                }
            }
            board[x][y] = 0;
            return;
        }

        sudoku(x, y + 1);

    }

    private static boolean possible(int x, int y, int target) {
        // 해당 행에 같은 숫자가 있을때
        for (int i = 0; i < 9; i++) {
            if (board[x][i] == target) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (board[i][y] == target) {
                return false;
            }
        }

        int set_x = x / 3 * 3;
        int set_y = y / 3 * 3;

        for (int i = set_x; i < set_x + 3; i++) {
            for (int j = set_y; j < set_y + 3; j++) {
                if (board[i][j] == target) {
                    return false;
                }
            }
        }

        return true;
    }
}
