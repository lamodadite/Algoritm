package boj1931;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }

            return o1[1] - o2[1];
        });

        int cnt = 0;
        int preEndTime = 0;

        for (int i = 0; i < N; i++) {
            if (preEndTime <= arr[i][0]) {
                preEndTime = arr[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
