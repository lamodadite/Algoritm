public class FloydWarshall {

    static int[][] dist;
    static final int INF = 100000000;
    public static void floydWarshall(int v, int e, int[][] data, int start) {
        dist = new int[v + 1][v + 1];

        for (int i = 1; i < v + 1; i++) {
            for (int j = 1; j < v + 1; j++) {
                if (i != j) {
                    dist[i][j] = INF;
                }
            }
        }

        for (int i = 0; i < e; i++) {
            dist[data[i][0]][data[i][1]] = data[i][2];
            dist[data[i][1]][data[i][0]] = data[i][2];
        }

        for (int k = 1; k < v + 1; k++) {
            // i -> j (k를 거쳐서 가는 경우가 짧으면 업데이트)
            for (int i = 1; i < v+ 1; i++) {
                for (int j = 1; j < v + 1; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        // 출력
        for (int i = 1; i < v + 1; i++) {
            for (int j = 1; j < v + 1; j++) {
                if (dist[i][j] >= INF) {
                    System.out.printf("%5s ", "INF");
                } else {
                    System.out.printf("%5d ", dist[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] data = {{1, 2, 1}, {2, 3, 1}, {3, 4, 1}, {4, 5, 1}, {2, 4 , 1}, {5, 3, 1}};
        floydWarshall(5, 6, data, 1);
    }


}
