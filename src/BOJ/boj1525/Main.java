package BOJ.boj1525;

import java.util.*;

public class Main {

    static String correct = "123456780";
    static Map<String, Integer> map = new HashMap<>();
    static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String init = "";
        for (int i = 0; i < 3; i++) {
            String[] s = sc.nextLine().split(" ");
            for (int j = 0; j < 3; j++) {
                int num = Integer.parseInt(s[j]);
                init += num;
            }
        }
        map.put(init, 0);
        System.out.println(bfs(init));
    }

    private static int bfs(String init) {
        Queue<String> q = new LinkedList<>();
        q.add(init);
        while (!q.isEmpty()) {
            String cur = q.poll();
            int move = map.get(cur);
            int empty = cur.indexOf("0");
            int px = empty % 3;
            int py = empty / 3;

            if (cur.equals(correct)) return move;

            for (int i = 0; i < 4; i++) {
                int nx = px + dir[i][0];
                int ny = py + dir[i][1];

                if (nx < 0 || ny < 0 || nx > 2 || ny > 2) continue;

                int nPos = ny * 3 + nx;
                char ch = cur.charAt(nPos);
                String next = cur.replace(ch, 'c');
                next = next.replace('0', ch);
                next = next.replace('c', '0');

                if (!map.containsKey(next)) {
                    q.add(next);
                    map.put(next, move + 1);
                }
            }
        }
        return -1;
    }
}
