package boj25304;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int N = sc.nextInt();
        int expected = 0;
        for (int i = 0; i < N; i++) {
            expected += sc.nextInt() * sc.nextInt();
        }

        if (total == expected) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
