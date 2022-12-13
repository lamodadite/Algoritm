package boj1978;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int primeCnt = 0;
        for (int i = 0; i < N; i++) {
            primeCnt += isPrime(sc.nextInt());
        }
        System.out.println(primeCnt);
    }

    private static int isPrime(int n) {
        if (n == 1) {
            return 0;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }

        return 1;
    }
}
