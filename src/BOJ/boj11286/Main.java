package BOJ.boj11286;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2;
                }
                return Math.abs(o1) - Math.abs(o2);
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int operation = sc.nextInt();
            if (operation == 0) {
                if (heap.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(heap.poll()).append("\n");
                }
            } else {
                heap.add(operation);
            }
        }

        System.out.println(sb);
    }
}
