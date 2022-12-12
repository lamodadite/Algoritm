package boj2775;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] apt;

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int k = sc.nextInt(), n = sc.nextInt();

            apt = new int[k + 1][n];
            for (int j = 1; j < n + 1; j++) {
                apt[k][j - 1] = j;
            }
            for (int j = 0; j < k; j++) {
                apt[j][0] = 1;
            }
            for (int j = k - 1; j >= 0; j--) {
                for (int l = 1; l < n; l++) {
                    apt[j][l] = apt[j][l - 1] + apt[j + 1][l];
                }
            }
            System.out.println(apt[0][n - 1]);
        }
    }
}
