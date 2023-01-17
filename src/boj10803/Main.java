package boj10803;

import java.util.Scanner;

public class Main {
    public static int N;
    public static int[][] origin;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        long B = sc.nextLong();

        origin = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                origin[i][j] = sc.nextInt() % 1000;
            }
        }

        int[][] result = pow(origin, B);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static int[][] pow(int[][] matrix, long expo) {
        if (expo == 1) {
            return matrix;
        }

        int[][] ret = pow(matrix, expo / 2);

        ret = multiple(ret, ret);

        if (expo % 2 == 1) {
            ret = multiple(ret, origin);
        }

        return ret;
    }

    private static int[][] multiple(int[][] A, int[][] B) {
        int[][] value = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                value[i][j] += matrix_multiple(i, j, N, A, B);
            }
        }
        return value;
    }

    private static int matrix_multiple(int x, int y, int M, int[][] A, int[][] B) {
        int result = 0;
        for (int i = 0; i < M; i++) {
            result += A[x][i] * B[i][y];
            result %= 1000;
        }
        return result;
    }
}
