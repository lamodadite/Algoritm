package boj25682;

import java.util.Scanner;

public class Main {
    public static boolean[][] chess;
    public static int N, M, K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        sc.nextLine();
        chess = new boolean[N + 1][M + 1];
        for (int i = 1; i < N + 1; i++) {
            String temp = sc.nextLine();
            for (int j = 1; j < M + 1; j++) {
                if (temp.charAt(j - 1) == 'W') {
                    chess[i][j] = true;
                }
            }
        }

        System.out.println(Math.min(minimal(true), minimal(false)));
    }

    private static int minimal(boolean color) {
        int[][] pSum = new int[N + 1][M + 1];
        boolean standard = color;
        int cnt = Integer.MAX_VALUE;
        int temp;
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < M + 1; j++) {
                temp = 0;
                if (chess[i][j] != standard) {
                    temp++;
                }
                pSum[i][j] = pSum[i - 1][j] + pSum[i][j - 1]
                        - pSum[i - 1][j - 1] + temp;
                standard = !standard;
            }
            standard = !standard;
        }
        for (int i = 1; i <= N - K + 1; i++) {
            for (int j = 1; j <= M - K + 1; j++) {
                cnt = Math.min(cnt, pSum[i + K - 1][j + K - 1] - pSum[i + K - 1][j - 1] - pSum[i - 1][j + K - 1] + pSum[i - 1][j - 1]);
            }
        }
        return cnt;
    }
}
