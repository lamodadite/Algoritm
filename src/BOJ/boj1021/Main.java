package BOJ.boj1021;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> deque = new LinkedList<>();

        int cnt = 0;

        int N = sc.nextInt(), M = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        int[] arr = new int[M];

        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {

            int target_idx = deque.indexOf(arr[i]);
            int half_idx = deque.size() == 0 ? deque.size() / 2 - 1 : deque.size() / 2;

            if (target_idx <= half_idx) {
                for (int j = 0; j < target_idx; j++) {
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    cnt++;
                }
            } else {
                for (int j = 0; j < deque.size() - target_idx; j++) {
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    cnt++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(cnt);

    }
}
