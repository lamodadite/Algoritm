package BOJ.boj9944;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] board = new char[N][M];
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String tmp = sc.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = tmp.charAt(j);
            }
        }
    }
}
