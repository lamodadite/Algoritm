import java.util.Arrays;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static int n;
    public static int m;
    public static boolean[] visit;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        n = 4;
        m = 2;

        visit = new boolean[n];
        arr = new int[m];

        dfs(0);

        System.out.println(sb);
    }

    private static void dfs(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}