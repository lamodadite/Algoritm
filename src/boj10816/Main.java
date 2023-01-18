package boj10816;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        use_binarySearch();
    }

    private static void use_binarySearch() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int m = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int key = sc.nextInt();

            sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(" ");
        }
        System.out.println(sb);
    }

    private static int lowerBound(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length;

        while (lo < hi) {
            int midIdx = lo + (hi - lo) / 2;

            if (target <= arr[midIdx]) {
                hi = midIdx;
            } else {
                lo = midIdx + 1;
            }
        }
        return lo;
    }

    private static int upperBound(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length;

        while (lo < hi) {
            int midIdx = lo + (hi - lo) / 2;

            if (target < arr[midIdx]) {
                hi = midIdx;
            } else {
                lo = midIdx + 1;
            }
        }
        return lo;
    }

    private static void use_hashMap() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int temp = sc.nextInt();
            if (map.containsKey(temp)) {
                sb.append(map.get(temp)).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}
