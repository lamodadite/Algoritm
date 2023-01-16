package boj1780;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[][] paper;
    public static int[] cnt = new int[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        paper = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                paper[i][j] = sc.nextInt();
            }
        }

        cut(0, 0, n);

        Arrays.stream(cnt).forEach(System.out::println);
    }

    private static void cut(int x, int y, int size) {
        if (isSame(x, y, size)) {
            cnt[paper[x][y]+1]++;
            return;
        }

        int newSize = size / 3;

        cut(x, y, newSize);
        cut(x + newSize, y, newSize);
        cut(x + newSize * 2, y, newSize);
        cut(x, y + newSize, newSize);
        cut(x, y + newSize * 2, newSize);
        cut(x + newSize, y + newSize, newSize);
        cut(x + newSize, y + newSize * 2, newSize);
        cut(x + newSize * 2, y + newSize, newSize);
        cut(x + newSize * 2, y + newSize * 2, newSize);
    }

    private static boolean isSame(int x, int y, int size) {
        int stand = paper[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != stand) {
                    return false;
                }
            }
        }
        return true;

    }


}
