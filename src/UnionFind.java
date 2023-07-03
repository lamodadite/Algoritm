public class UnionFind {
    public static void main(String[] args) {
        int[] parents = new int[11];
        for (int i = 1; i <= parents.length - 1; i++) {
            parents[i] = i;
        }

        union(parents, 1, 2);
        union(parents, 2, 3);
        union(parents, 3, 4);
        union(parents, 5, 6);
        union(parents, 6, 7);
        union(parents, 7, 8);
        System.out.println("1과 5는 연결되어 있나? : " + findParent(parents, 1, 5));
        union(parents, 1, 5);
        System.out.println("1과 5는 연결되어 있나? : " + findParent(parents, 1, 5));


    }

    private static boolean findParent(int[] parents, int a, int b) {
        a = getParent(parents, a);
        b = getParent(parents, b);
        return a == b;
    }

    private static void union(int[] parents, int a, int b) {
        a = getParent(parents, a);
        b = getParent(parents, b);
        if (a < b) parents[b] = a;
        else parents[a] = b;
    }

    private static int getParent(int[] parents, int a) {
        if (parents[a] == a) return a;
        return parents[a] = getParent(parents, parents[a]);
    }
}
