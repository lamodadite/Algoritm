package BOJ.boj1504;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    static ArrayList<ArrayList<Node>> graph;
    final static int INF = 10000000;
    static int n;
    static class Node {
        int to;
        int weight;

        public Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 정점 개수
        int e = sc.nextInt(); // 간선 개수
        graph = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < e; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int weight = sc.nextInt();

            graph.get(from).add(new Node(to, weight));
            graph.get(to).add(new Node(from, weight));
        }
        int via1 = sc.nextInt();
        int via2 = sc.nextInt();

        int case1 = 0;
        // start -> via1 -> via2 -> end
        case1 += dijkstra(1, via1);
        case1 += dijkstra(via1, via2);
        case1 += dijkstra(via2, n);

        int case2 = 0;
        // start -> via2 -> via1 -> end
        case2 += dijkstra(1, via2);
        case2 += dijkstra(via2, via1);
        case2 += dijkstra(via1, n);

        if (case1 >= INF && case2 >= INF) {
            System.out.println(-1);
        } else {
            System.out.println(Math.min(case1, case2));
        }
    }

    private static int dijkstra(int start, int end) {
        PriorityQueue<Node> pq = new PriorityQueue<>((x, y) -> x.weight - y.weight);

        pq.add(new Node(start, 0));

        int[] dist = new int[n + 1];
        for (int i = 0; i < n + 1; i++) dist[i] = INF;

        boolean[] visited = new boolean[n + 1];
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Node curNode = pq.poll();

            if (visited[curNode.to]) {
                continue;
            }
            visited[curNode.to] = true;

            for (int i = 0; i < graph.get(curNode.to).size(); i++) {
                Node adjNode = graph.get(curNode.to).get(i);
                if (!visited[adjNode.to] && dist[adjNode.to] > curNode.weight + adjNode.weight) {
                    dist[adjNode.to] = curNode.weight + adjNode.weight;
                    pq.add(new Node(adjNode.to, dist[adjNode.to]));
                }
            }

        }
        return dist[end];
    }
}
