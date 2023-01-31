package BOJ.boj2563;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] drawingPaper = new boolean[101][101];
        
        int n = sc.nextInt();
        int r, c;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            r = sc.nextInt();
            c = sc.nextInt();
            for (int j = r; j < r + 10; j++) {
                for (int k = c; k < c + 10; k++) {
                    if (drawingPaper[j][k]) {
                        continue;
                    }
                    drawingPaper[j][k] = true;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
