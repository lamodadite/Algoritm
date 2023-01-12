package boj15828;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Deque<Integer> buffer = new ArrayDeque<>();

        while (true) {
            int packet = sc.nextInt();
            if (packet == -1) {
                break;
            }

            if (packet == 0) {
                buffer.pop();
                continue;
            }

            if (buffer.size() < n) {
                buffer.addLast(packet);
            }
        }

        if (buffer.size() == 0) {
            System.out.print("empty");
        } else {
            buffer.forEach(x -> System.out.print(x + " "));
        }
    }
}
