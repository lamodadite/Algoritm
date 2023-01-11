package boj10828;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyStack myStack = new MyStack();

        int n = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        StringBuilder sb = new StringBuilder();
        for (String x : list) {
            if (x.startsWith("push")) {
                String[] chunks = x.split(" ");
                myStack.push(Integer.parseInt(chunks[1]));
            } else if ("pop".equals(x)) {
                sb.append(myStack.pop()).append("\n");
            } else if ("size".equals(x)) {
                sb.append(myStack.size()).append("\n");
            } else if ("empty".equals(x)) {
                sb.append(myStack.isEmpty()).append("\n");
            } else {
                sb.append(myStack.top()).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static class MyStack {
        ArrayList<Integer> list;

        public MyStack() {
            this.list = new ArrayList<>();
        }

        public void push(int x) {
            this.list.add(x);
        }

        public int isEmpty() {
            if (this.list.size() == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        public int pop() {
            if (this.isEmpty() == 1) {
                return -1;
            }
            int temp = this.list.get(list.size() - 1);
            this.list.remove(list.size() - 1);
            return temp;
        }

        public int size() {
            return this.list.size();
        }

        public int top() {
            return this.isEmpty() == 1 ? -1 : this.list.get(this.list.size() - 1);
        }
    }
}
