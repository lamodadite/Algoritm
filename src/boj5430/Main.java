package boj5430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        ArrayDeque<Integer> deque;
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            String order = br.readLine();
            int n = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine(), "[],");

            deque = new ArrayDeque<>();

            for (int j = 0; j < n; j++) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            AC(order, deque);
        }
        System.out.println(sb);
    }

    private static void AC(String order, ArrayDeque<Integer> deque) {

        boolean isRight = true;

        for (char cmd : order.toCharArray()) {

            if (cmd == 'R') {
                isRight = !isRight;
                continue;
            }

            if(isRight) {
                if(deque.pollFirst() == null) {
                    sb.append("error\n");
                    return;
                }

            }
            else {
                if(deque.pollLast() == null) {
                    sb.append("error\n");
                    return;
                }
            }
        }

        sb.append('[');

        if (deque.size() > 0) {
            if (isRight) {
                sb.append(deque.pollFirst());

                while (!deque.isEmpty()) {
                    sb.append(',').append(deque.pollFirst());
                }
            } else {
                sb.append(deque.pollLast());

                while(!deque.isEmpty()) {
                    sb.append(',').append(deque.pollLast());
                }
            }
        }

        sb.append(']').append("\n");

    }

}
