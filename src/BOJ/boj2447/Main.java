package BOJ.boj2447;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        arr = new String[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(arr[i], " ");
        }

        starRecursion(0, 0, N);
        StringBuilder sb = new StringBuilder();
        for (String[] strings : arr) {
            for (String string : strings) {
                sb.append(string);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void starRecursion(int x, int y, int N) {
        if (N == 1) {
            arr[x][y] = "*";
            return;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(i == 1 && j == 1)) {
                    starRecursion(x + i*(N/3), y + j*(N/3), N/3);
                }
            }
        }
    }
}
