package boj11399;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 1; i < N; i++) {
            arr[i] += arr[i - 1];
        }

        System.out.println(Arrays.stream(arr).sum());
    }
}
