package BOJ.boj14889;

import java.util.Scanner;

public class Main {
    public static int n;
    public static boolean[] visit;
    public static int[][] board;
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        board = new int[n][n];
        visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        recursion(0, 0);

        System.out.println(min);
    }

    private static void recursion(int idx, int count) {
        if (count == n / 2) {
            findMin();
            return;
        }

        for (int i = idx; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                recursion(i + 1, count + 1);
                visit[i] = false;
            }
        }
    }

    private static void findMin() {

        int start_score = 0;
        int link_score = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (visit[i] && visit[j]) {
                    start_score += board[i][j];
                    start_score += board[j][i];
                } else if (!visit[i] && !visit[j]) {
                    link_score += board[i][j];
                    link_score += board[j][i];
                }
            }
        }
        int value = Math.abs(start_score - link_score);

        if (value == 0) {
            System.out.println(0);
            System.exit(0);
        }

        min = Math.min(min, value);
    }


}
