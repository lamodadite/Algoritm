package BOJ.boj1753;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

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

        int v = sc.nextInt(); // 정점 개수
        int e = sc.nextInt(); // 간선 개수
        int k = sc.nextInt(); // 시작 정점의 번호

        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        for (int i = 0; i < v + 1; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < e; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int weight = sc.nextInt();
            graph.get(from).add(new Node(to, weight));
        }

        int[] dist = new int[v + 1];


        for (int i = 1; i < v + 1; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[k] = 0;

        boolean[] visited = new boolean[v + 1];

        for (int i = 0; i < v; i++) {
            int minDist = Integer.MAX_VALUE;
            int curIdx = 0;
            for (int j = 1; j < v + 1; j++) {
                if (!visited[j] && dist[j] < minDist) {
                    minDist = dist[j];
                    curIdx = j;
                }
            }

            visited[curIdx] = true;

            for (int j = 0; j < graph.get(curIdx).size(); j++) {
                Node adjNode = graph.get(curIdx).get(j);
                if (dist[adjNode.to] > dist[curIdx] + adjNode.weight) {
                    dist[adjNode.to] = dist[curIdx] + adjNode.weight;
                }
            }
        }

        for (int i = 1; i < v + 1; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(dist[i]);
            }
        }
    }
}
