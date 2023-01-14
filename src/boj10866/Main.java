package boj10866;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int[] deque = new int[10001];
        StringBuilder sb = new StringBuilder();
        int front = 0;
        int back = 0;
        int size = 0;

        for (int i = 0; i < n; i++) {
            String temp = sc.nextLine();

            if (temp.startsWith("push_front")) {
                deque[front] = Integer.parseInt(temp.split(" ")[1]);
                front = (front - 1 + deque.length) % deque.length;
                size++;
            } else if (temp.startsWith("push_back")) {
                back = (back + 1) % deque.length;
                size++;
                deque[back] = Integer.parseInt(temp.split(" ")[1]);

            } else if ("pop_front".equals(temp)) {
                if (size == 0) {
                    sb.append(-1).append("\n");
                } else {
                    int ret = deque[(front + 1) % deque.length];
                    front = (front + 1) % deque.length;
                    size--;
                    sb.append(ret).append("\n");
                }
            } else if ("pop_back".equals(temp)) {
                if (size == 0) {
                    sb.append(-1).append("\n");
                } else {
                    int ret = deque[back];
                    back = (back - 1 + deque.length) % deque.length;
                    size--;
                    sb.append(ret).append("\n");
                }
            } else if ("size".equals(temp)) {
                sb.append(size).append("\n");
            } else if ("empty".equals(temp)) {
                if (size == 0) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if ("front".equals(temp)) {
                if (size == 0) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque[(front + 1) % deque.length]).append("\n");
                }
            } else {
                if (size == 0) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque[back]).append("\n");
                }
            }
        }
        System.out.println(sb);

    }
}
