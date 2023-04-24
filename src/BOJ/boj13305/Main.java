package BOJ.boj13305;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        original();
        second();
    }

    private static void second() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 주유소 갯수
        long[] road = new long[n - 1];
        long[] station = new long[n];

        for (int i = 0; i < n - 1; i++) {
            road[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            station[i] = sc.nextInt();
        }

        long sum = 0;
        long min = station[0];

        for (int i = 0; i < n - 1; i++) {
            if (station[i] < min) {
                min = station[i];
            }
            sum += min * road[i];
        }

        System.out.println(sum);
    }

    private static void original() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] road = new long[n - 1];
        long[] station = new long[n];

        for (int i = 0; i < n - 1; i++) {
            road[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            station[i] = sc.nextInt();
        }
        int p1 = 0;
        int p2 = 1;
        long result = 0;
        while (p2 < n) {
            if (station[p1] > station[p2] || p2 == n - 1) {
                int temp = 0;
                for (int i = p1; i < p2; i++) {
                    temp += road[i];
                }
                result += temp * station[p1];
                p1 = p2;
                p2++;
            } else {
                p2++;
            }
        }
        System.out.println(result);
    }
}
