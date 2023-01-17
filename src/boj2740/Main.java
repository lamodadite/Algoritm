package boj2740;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();

        int[][] matrixA = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        M = sc.nextInt();
        int K = sc.nextInt();

        int[][] matrixB = new int[M][K];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < K; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        int[][] answer = new int[N][K];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                answer[i][j] = matrix_multiple(i, j, M, matrixA, matrixB);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int[] ints : answer) {
            for (int anInt : ints) {
                sb.append(anInt).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static int matrix_multiple(int x, int y, int M, int[][] A, int[][] B) {
        int result = 0;
        for (int i = 0; i < M; i++) {
            result += A[x][i] * B[i][y];
        }
        return result;
    }
}
