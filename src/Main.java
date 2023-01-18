import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        int[] arr = new int[n];
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }

        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());

    }
}