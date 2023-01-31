package BOJ.boj11659;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = sc.nextInt();
        }
        int[] pSum = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            pSum[i] = pSum[i - 1] + arr[i];
        }

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            System.out.println(pSum[end] - pSum[start - 1]);
        }

    }
}
