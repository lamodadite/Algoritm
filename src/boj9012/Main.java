package boj9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] split = sc.nextLine().split("");
            for (int j = 0; j < split.length; j++) {
                stack.push(split[j]);
            }
            sb.append(isVps(stack)).append("\n");
            stack.clear();
        }

        System.out.println(sb);
    }

    private static String isVps(Stack<String> stack) {
        int temp = 0;
        while (!stack.isEmpty()) {
            if (")".equals(stack.pop())) {
                temp++;
            } else {
                temp--;
                if (temp < 0) {
                    return "NO";
                }
            }
        }
        return temp == 0 ? "YES" : "NO";
    }
}
