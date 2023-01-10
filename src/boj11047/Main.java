package boj11047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), K = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt = 0;

        for (int i = N - 1; i >= 0; i--) {
            if (K >= arr[i]) {
                while (K >= arr[i]) {
                    K -= arr[i];
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
