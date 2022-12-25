package boj1004;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int sx, sy, dx, dy;
        int n;
        int answer;
        int cx, cy, r;
        for (int i = 0; i < T; i++) {
            sx = sc.nextInt();
            sy = sc.nextInt();
            dx = sc.nextInt();
            dy = sc.nextInt();
            n = sc.nextInt();
            answer = 0;
            for (int j = 0; j < n; j++) {
                cx = sc.nextInt();
                cy = sc.nextInt();
                r = sc.nextInt();

                // 둘 중 하나를 포함하면서, 둘 다 포함하진 않을때 answer에 + 1
                if (isCircleContainCoordinate(r, sx, sy, cx, cy) ||
                    isCircleContainCoordinate(r, dx, dy, cx, cy)) {
                    if (!(isCircleContainCoordinate(r, sx, sy, cx, cy) &&
                            isCircleContainCoordinate(r, dx, dy, cx, cy))) {
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }
    public static boolean isCircleContainCoordinate(int r, int x, int y, int cx, int cy) {
        // 해당 좌표가 원에 포함되면 true를 리턴
        return Math.pow(r, 2) > (Math.pow(cx - x, 2)) + (Math.pow(cy - y, 2));
    }
}
