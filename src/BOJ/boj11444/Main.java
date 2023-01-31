package BOJ.boj11444;

import java.util.Scanner;

public class Main {
    final static long MOD = 1000000007;
    public static long[][] origin = {{1, 1},
                                     {1, 0}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[][] A = {{1, 1},
                      {1, 0}};

        long N = sc.nextLong();

        System.out.println(pow(A, N - 1)[0][0]);
    }

    private static long[][] pow(long[][] A, long expo) {

        if (expo == 1 | expo == 0) {
            return A;
        }

        long[][] ret = pow(A, expo / 2);

        ret = multiple(ret, ret);

        if (expo % 2 == 1) {
            ret = multiple(ret, origin);
        }

        return ret;
    }

    private static long[][] multiple(long[][] A, long[][] B) {

        long[][] ret = new long[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    ret[i][j] += A[i][k] * B[k][j];
                    ret[i][j] %= MOD;
                }
            }
        }
        return ret;
    }


}
