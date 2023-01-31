package BOJ.boj2292;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N == 1) {
            System.out.println(1);
            return;
        }
        int[] dp = new int[100000000];
        dp[1] = 1;
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            dp[i] = dp[i-1] + 6 * (i - 1);
            if (dp[i] >= N) {
                System.out.println(i);
                return;
            }
        }

    }
}
