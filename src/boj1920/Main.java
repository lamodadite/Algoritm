package boj1920;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int temp = sc.nextInt();
            sb.append(isExist(temp)).append("\n");
        }

        System.out.println(sb);
    }

    private static int isExist(int x) {

        int lo = 0;
        int hi = arr.length - 1;
        int mid;
        int midIdx;

        while (lo <= hi) {
            midIdx = (lo + hi) / 2;
            mid = arr[midIdx];

            if (mid > x) {
                hi = midIdx - 1;
            } else if (mid < x) {
                lo = midIdx + 1;
            } else return 1;
        }
        return 0;
    }
}
