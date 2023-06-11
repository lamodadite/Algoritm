package BOJ.boj14461;

import java.util.*;

public class Main {
    static int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static class Cow{
        int x;
        int y;
        int time;
        int h;  // 3이 되면 풀을 먹여야 함
        boolean[][] v;

        public Cow(int x, int y, int time, int h, boolean[][] v) {
            this.x = x;
            this.y = y;
            this.time = time;
            this.h = h;
            this.v = v;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][n];
        visited[0][0] = true;
        Queue<Cow> q = new LinkedList();
        q.offer(new Cow(0, 0, 0, 0, visited));
        int answer = Integer.MAX_VALUE;

        while (!q.isEmpty()) {
            Cow cur = q.poll();
            if (cur.x == n-1 && cur.y == n-1) {
                answer = Math.min(answer, cur.time);
            }

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dir[i][0];
                int ny = cur.y + dir[i][1];

                if (nx < 0 || ny < 0 || nx > n - 1 || ny > n - 1 || cur.v[nx][ny]) continue;
                boolean[][] tmp = new boolean[cur.v.length][];
                for (int j = 0; j < cur.v.length; j++) {
                    tmp[j] = cur.v[j].clone();
                }
                tmp[nx][ny] = true;
                if (cur.h == 3) {
                    q.offer(new Cow(nx, ny, cur.time + t + arr[nx][ny], 0, tmp));
                } else {
                    q.offer(new Cow(nx, ny, cur.time + t, cur.h + 1, tmp));
                }
            }
        }
        System.out.println(answer);
    }
}
