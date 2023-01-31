package BOJ.boj1149;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // red = 0, green = 1, blue = 2

        int n = sc.nextInt();

        int[][] cost = new int[n][3];

        for (int i = 0; i < n; i++) {
            cost[i][0] = sc.nextInt();
            cost[i][1] = sc.nextInt();
            cost[i][2] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            cost[i][0] += Math.min(cost[i - 1][1], cost[i - 1][2]);
            cost[i][1] += Math.min(cost[i - 1][2], cost[i - 1][0]);
            cost[i][2] += Math.min(cost[i - 1][1], cost[i - 1][0]);
        }

        System.out.println(Math.min(cost[n - 1][0], Math.min(cost[n - 1][1], cost[n - 1][2])));
    }
}
