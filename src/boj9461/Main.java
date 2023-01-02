package boj9461;

import java.util.Scanner;

public class Main {
    public static long[] dp = new long[103];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        dp[1] = dp[2] = dp[3] = 1;
        dp[4] = dp[5] = 2;

        for (int i = 6; i < 101; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }

        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            sb.append(dp[n]).append("\n");
        }

        System.out.println(sb);
    }
}
