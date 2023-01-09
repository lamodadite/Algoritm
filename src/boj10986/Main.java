package boj10986;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();
        long result = 0;
        long[] pSum = new long[N + 1];
        long[] cnt = new long[M];


        for (int i = 1; i < N + 1; i++) {
            pSum[i] = (pSum[i - 1] + sc.nextInt()) % M;
            if (pSum[i] == 0) result++;
            cnt[(int)pSum[i]]++;
        }

        for (int i = 0; i < M; i++) {
            if (cnt[i] > 1) {
                result += (cnt[i] * (cnt[i] - 1)) / 2;
            }
        }

        System.out.println(result);
    }
}
