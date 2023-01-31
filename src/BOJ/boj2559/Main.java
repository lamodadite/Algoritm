package BOJ.boj2559;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), k = sc.nextInt();

        int[] arr = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            arr[i] = sc.nextInt();
        }

        int[] pSum = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            pSum[i] = pSum[i - 1] + arr[i];
        }

        int max = -1000001;
        for (int i = k; i < n + 1; i++) {
            int temp = pSum[i] - pSum[i - k];
            max = Math.max(max, temp);
        }
        System.out.println(max);
    }
}
