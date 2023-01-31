package BOJ.boj1018;

import java.util.Scanner;

public class Main {
    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();
        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String temp = sc.next();
            for (int j = 0; j < M; j++) {
                if (temp.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                count(i, j);
            }
        }
        System.out.println(min);
    }

    private static void count(int x, int y) {

        boolean standard = true; // 하얀색 시작
        int cnt = 0;
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (standard != arr[i][j]) {
                    cnt++;
                }
                standard = !standard; // 반대로
            }
            standard = !standard; // 다음열로 넘어갈때 반대로
        }
        cnt = Math.min(cnt, 64 - cnt); // 흑시작 백시작 중 어떤게 더 작은지
        min = Math.min(min, cnt);
    }
}
