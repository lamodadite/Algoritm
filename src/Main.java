import java.util.Scanner;

public class Main {
    final static int mod = 1000000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] wine = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 0; i < n; i++) {
            wine[i] = sc.nextInt();
        }

        dp[1] = wine[0];
        if (n > 1) {
            dp[2] = dp[1] + wine[1];
        }

        for (int i = 3; i < n + 1; i++) {
            dp[i] = dp[i - 3] + wine[i - 2] + wine[i - 1];
            dp[i] = Math.max(dp[i], dp[i - 2] + wine[i - 1]);
            dp[i] = Math.max(dp[i], dp[i - 1]);
        }

        System.out.println(dp[n]);



    }
}