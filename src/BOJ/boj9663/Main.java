package BOJ.boj9663;

import java.util.Scanner;

public class Main {
    static int[] chess;
    static int cnt;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        chess = new int[N];

        nQueen(0);

        System.out.println(cnt);
    }

    private static void nQueen(int depth) {
        if (depth == N) {
            cnt++;
            return;
        }

        for (int i = 0; i < N; i++) {
            chess[depth] = i;
            if (possible(depth)) {
                nQueen(depth + 1);
            }
        }
    }

    private static boolean possible(int col) {

        for (int i = 0; i < col; i++) {
            // 해당 열의 행과 i열의 행이 일치할경우 (같은 행에 존재할 경우)
            if (chess[col] == chess[i]) {
                return false;
            }

            // 대각선상에 놓여있는 경우
            // 열의 차와 행의 차가 같을 경우
            else if (Math.abs(col - i) == Math.abs(chess[col] - chess[i])) {
                return false;
            }
        }

        return true;
    }
}
