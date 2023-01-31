package BOJ.boj11660;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();
        int[][] pSum = new int[N + 1][N + 1];
        int result;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                pSum[i][j] = pSum[i - 1][j] + pSum[i][j - 1]
                        - pSum[i - 1][j - 1] + sc.nextInt();
            }
        }

        for (int i = 0; i < M; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            result = pSum[x2][y2] - pSum[x2][y1 - 1] - pSum[x1 - 1][y2] + pSum[x1 - 1][y1 - 1];
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
