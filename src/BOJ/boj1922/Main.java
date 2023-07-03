package BOJ.boj1922;

import java.util.*;

public class Main {
    static int[] parents;
    static PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.weight - o2.weight);
    static class Node {
        int from;
        int to;
        int weight;

        public Node(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 컴퓨터의 개수
        int m = sc.nextInt(); // 간선의 개수

        parents = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parents[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int w = sc.nextInt();

            pq.add(new Node(a, b, w));
        }
        int answer = 0;
        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            int x = find(cur.from);
            int y = find(cur.to);
            if (x == y) continue;
            union(x, y);
            answer += cur.weight;
        }
        System.out.println(answer);
    }

    private static int find(int x) {
        if (x == parents[x]) {
            return x;
        }
        return parents[x] = find(parents[x]);
    }

    private static void union(int x, int y) {
        int px = find(x);
        int py = find(y);
        if (px < py) {
            parents[py] = px;
        } else {
            parents[px] = py;
        }
    }


}
