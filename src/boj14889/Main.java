package boj14889;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static int n;
    public static int[] startTeam;
    public static int[][] board;
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        startTeam = new int[n/2];

        recursion(0, 0);

    }

    private static void recursion(int depth, int count) {
        if (depth == n/2) {
            findMin();
            return;
        }

        for (int i = depth; i < n - 1; i++) {
            startTeam[depth] = i + 1;
            recursion(depth + 1, count + 1);

        }
    }

    private static void findMin() {

    }


}
