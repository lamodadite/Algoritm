package boj2630;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static int[][] paper;
    public static int blue_cnt = 0;
    public static int white_cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                paper[i][j] = sc.nextInt();
            }
        }

        cut(0, 0, N);

        System.out.println(white_cnt);
        System.out.println(blue_cnt);
    }

    private static void cut(int x, int y, int size) {

        if (isfull(x, y, size)) {
            if (paper[x][y] == 1) {
                blue_cnt++;
            } else {
                white_cnt++;
            }
            return;
        }

        cut(x, y, size/2); // 1
        cut(x + size/2, y, size/2); // 2
        cut(x, y + size/2, size/2); // 3
        cut(x + size/2, y + size/2, size/2); // 4
    }

    private static boolean isfull(int x, int y, int size) {
        int color = paper[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}
