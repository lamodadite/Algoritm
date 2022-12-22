package boj10815;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.nextInt());
        }
        int M = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            list.add(sc.nextInt());
        }

        StringBuilder sb = new StringBuilder();

        for (int x : list) {
            if (set.contains(x)) {
                sb.append(1 + " ");
            } else {
                sb.append(0 + " ");
            }
        }
        System.out.println(sb);
    }
}
