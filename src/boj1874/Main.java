package boj1874;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
        }

        int idx = 0;
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            stack.push(i);
            sb.append("+").append("\n");
            while (true) {
                if (idx >= n) {
                    break;
                }
                if (!stack.isEmpty() && arr[idx] == stack.peek()) {
                    stack.pop();
                    sb.append("-").append("\n");
                    idx++;
                } else {
                    break;
                }
            }
        }

        System.out.println(idx == n ? sb : "NO");
    }
}
