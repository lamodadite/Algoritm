package BOJ.boj9020;

import java.util.Scanner;

public class Main {
    public static boolean[] prime;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prime = new boolean[10001];
        getPrime();
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int a = n/2;
            int b = n/2;
            while (true) {
                if (!prime[a] && !prime[b]) {
                    System.out.println(a + " " + b);
                    break;
                }
                a--;
                b++;
            }
        }
    }

    public static void getPrime() {
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
