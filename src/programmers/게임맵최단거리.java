package programmers;

import java.util.*;
public class 게임맵최단거리 {
    class Solution {

        public static void main(String[] args) {
            System.out.println(Solution.solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}}));
        }
        public static int solution(int[][] maps) {
            boolean[][] visited = new boolean[maps.length][maps[0].length];
            int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            Queue<int[]> q = new LinkedList<>();

            q.add(new int[]{0, 0, 1});
            visited[0][0] = true;
            while (!q.isEmpty()) {
                int[] cur = q.poll();
                if (cur[0] == maps.length - 1 && cur[1] == maps[0].length) {
                    return cur[2];
                }
                int nx, ny;
                for (int i = 0; i < 4; i++) {
                    nx = cur[0] + dir[i][0];
                    ny = cur[1] + dir[i][1];

                    if (nx >= 0 && ny >= 0 && nx < maps.length && ny < maps[0].length && !visited[nx][ny] && maps[nx][ny] == 1) {
                        q.add(new int[]{nx, ny, cur[2] + 1});
                        visited[nx][ny] = true;
                    }
                }
            }
            return -1;
        }
    }
}
