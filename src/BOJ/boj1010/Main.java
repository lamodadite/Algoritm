package BOJ.boj1010;

import java.util.Scanner;

public class Main {
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int N, M;
        for (int i = 0; i < T; i++) {
            N = sc.nextInt();
            M = sc.nextInt();
            dp = new int[M + 1][N + 1];
            System.out.println(BC(M, N));
        }
    }

    private static int BC(int r, int k) {

        if (dp[r][k] > 0) {
            return dp[r][k];
        }

        if (k == 0 || r == k) {
            return dp[r][k] = 1;
        }

        return dp[r][k] = BC(r - 1, k - 1) + BC(r - 1, k);
    }
}
