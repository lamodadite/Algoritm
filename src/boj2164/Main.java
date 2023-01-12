package boj2164;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            q.addLast(i);
        }

        while (q.size() != 1) {
            q.removeFirst();
            int temp = q.removeFirst();
            q.addLast(temp);
        }

        System.out.println(q.peek());
    }
}
