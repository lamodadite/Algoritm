package BOJ.boj1992;

import java.util.Scanner;

public class Main {
    public static int[][] image;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        image = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] temp = sc.nextLine().split("");
            for (int j = 0; j < n; j++) {
                image[i][j] = Integer.parseInt(temp[j]);
            }
        }

        quad_tree(0, 0, n);

        System.out.println(sb);
    }

    private static void quad_tree(int x, int y, int size) {
        if (isFull(x, y, size)) {
            sb.append(image[x][y]);
            return;
        }

        sb.append("(");
        quad_tree(x, y, size / 2); // 왼쪽 위
        quad_tree(x, y + size / 2, size / 2); // 왼쪽 아래
        quad_tree(x + size / 2, y, size / 2); // 오른쪽 위
        quad_tree(x + size / 2, y + size / 2, size / 2); // 오른쪽 아래
        sb.append(")");
    }

    private static boolean isFull(int x, int y, int size) {
        int color = image[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (image[i][j] != color) {
                    return false;
                }
            }
        }

        return true;

    }
}
