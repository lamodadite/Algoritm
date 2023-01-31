package BOJ.boj11866;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), K = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }
        while (q.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                int temp = q.poll();
                q.add(temp);
            }
            sb.append(q.poll()).append(", ");
        }

        sb.append(q.poll()).append(">");
        System.out.println(sb);
    }
}
