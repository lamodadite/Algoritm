package BOJ.boj6443;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            visited = new boolean[s.length()];
            char[] tmp = s.toCharArray();
            Arrays.sort(tmp);
            String ns = new String(tmp);

            permutation(ns, 0, "");
        }
    }

    public static void permutation(String s, int d, String result) {
        if (d == s.length()) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                permutation(s, d + 1, result + s.charAt(i));
                visited[i] = false;
            }
        }
    }
}
