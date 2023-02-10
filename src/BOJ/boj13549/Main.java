package BOJ.boj13549;

import java.awt.*;
import java.util.*;

public class Main {
    static int[] dir = {1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 수빈이의 위치
        int k = sc.nextInt(); // 동생의 위치

        boolean[] visited = new boolean[1000000];

        Deque<Point> q = new LinkedList<>();
        q.add(new Point(n, 0));

        while (!q.isEmpty()) {
            Point cur = q.poll();
            visited[cur.x] = true;

            if (cur.x == k) {
                System.out.println(cur.y);
                return;
            }

            int nx;
            for (int i = 0; i < 3; i++) {
                if (i == 0) {
                    nx = cur.x * 2;
                    if (nx <= 200000 && !visited[nx]) {
                        q.addFirst(new Point(nx, cur.y));
                    }
                } else {
                    nx = cur.x + dir[i - 1];
                    if (nx >= 0 && nx <= 200000 && !visited[nx]) {
                        q.add(new Point(nx, cur.y + 1));
                    }
                }
            }
        }
    }
}