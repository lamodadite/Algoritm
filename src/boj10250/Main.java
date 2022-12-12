package boj10250;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int H, W, N;
        for (int i = 0; i < n; i++) {
            H = sc.nextInt();
            W = sc.nextInt();
            N = sc.nextInt();

            int front = N % H == 0 ? H : N % H;
            int back = N % H == 0 ? N/H : N/H + 1;

            System.out.printf(String.format("%d%02d", front, back));
            System.out.println("");
        }
        sc.close();
    }
}
