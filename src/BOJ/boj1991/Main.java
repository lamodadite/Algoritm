package BOJ.boj1991;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] tree = new String[n * 3];

        sc.nextLine();
        String parent, left, right;
        for (int i = 0; i < n; i++) {
            String[] node = sc.nextLine().split(" ");
            parent = node[0];
            left = node[1];
            right = node[2];
            int order = (int) parent.charAt(0) - (int) 'A';
            tree[order] = parent;
            tree[order * 2 + 1] = left;
            tree[order * 2 + 2] = right;
        }

        System.out.println(-1);
    }
}
