package BOJ.boj2933;

import org.w3c.dom.Node;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int r, c, n;
    static char[][] map;
    static boolean[][] visited;
    static Queue<Point> q = new LinkedList<>();
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new char[r][c];

        for (int i = 0; i < r; i++) {
            map[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            int row = r - Integer.parseInt(st.nextToken());

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < r; i++) {
            sb.append(map[i]);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
