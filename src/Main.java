import java.util.*;

class Solution {
    static Node[] graph;


    static class Node {
        int idx;
        int color;
        ArrayList<Node> child = new ArrayList<>();

        public Node(int idx, int color) {
            this.idx = idx;
            this.color = color;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        loop:
        while (t-- > 0) {
            int v = sc.nextInt(); // 정점의 개수
            int e = sc.nextInt(); // 간선의 개수
            graph = new Node[v + 1];
            for (int i = 1; i < graph.length; i++) graph[i] = new Node(i, 0);
            for (int i = 0; i < e; i++) {
                int from = sc.nextInt();
                int to = sc.nextInt();
                graph[from].child.add(graph[to]);
                graph[to].child.add(graph[from]);
            }
            for (int i = 1; i < graph.length; i++) {
                if (graph[i].color == 0) {
                    if (!bfs(i)) {
                        sb.append("NO\n");
                        continue loop;
                    }
                }
            }
            sb.append("YES\n");
        }
        System.out.println(sb);
    }

    private static boolean bfs(int x) {
        Queue<Node> q = new LinkedList<>();
        graph[x].color = 1;
        q.add(graph[x]);

        while (!q.isEmpty()) {
            Node cur = q.poll();
            ArrayList<Node> child = cur.child;
            for (int j = 0; j < child.size(); j++) {
                Node adjNode = child.get(j);
                if (cur.color == adjNode.color) {
                    return false;
                }
                if (adjNode.color == 0) {
                    adjNode.color = (cur.color == 1 ? 2 : 1);
                    q.add(adjNode);
                }
            }
        }
        return true;
    }
}