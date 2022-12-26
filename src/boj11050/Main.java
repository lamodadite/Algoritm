package boj11050;

import java.util.Scanner;

public class Main {
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), K = sc.nextInt();
        dp = new int[N + 1][K + 1];
        System.out.println(BC(N, K));
    }

    private static int BC(int n, int k) {
        if (dp[n][k] > 0) {
            return dp[n][k];
        }


        if (k == 0 || n == k) {
            return dp[n][k] = 1;
        }

        return dp[n][k] = BC(n - 1, k - 1) + BC(n - 1, k);
    }
}
