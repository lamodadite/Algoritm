package boj13305;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] road = new int[n - 1];
        int[] station = new int[n];

        for (int i = 0; i < n - 1; i++) {
            road[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            station[i] = sc.nextInt();
        }
        int p1 = 0;
        int p2 = 1;
        int result = 0;
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
