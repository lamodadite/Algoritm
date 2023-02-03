package BOJ.boj2667;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static int[][] map; // 지도 이차원 배열
    static ArrayList<Integer> list = new ArrayList<>(); // 각 단지의 속하는 집의 수를 담을 리스트
    static int cnt; // 한 단지에 몇개의 집이 존재하는 셀 변수
    static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; // 방향 -> 동, 서, 남, 북

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        map = new int[n][n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String temp = sc.nextLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = temp.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    map[i][j] = 0;
                    cnt = 0;
                    dfs(i, j);
                    list.add(cnt);
                }
            }
        }

        System.out.println(list.size());
        list.sort(Comparator.naturalOrder());
        list.forEach(System.out::println);
    }

    static void dfs(int x, int y) {
        cnt++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dir[i][0];
            int ny = y + dir[i][1];
            if (nx >= 0 && nx < map.length && ny >= 0 && ny < map[0].length && map[nx][ny] == 1) {
                map[nx][ny] = 0;
                dfs(nx, ny);
            }
        }
    }
}
