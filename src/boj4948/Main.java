package boj4948;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean[] prime;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        ArrayList<Integer> nList = new ArrayList<>();
        while (true) {
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            nList.add(n);
        }
        int max = nList.stream().mapToInt(i -> i).max().getAsInt();
        prime = new boolean[(2 * max) + 1];

        prime();

        for (int x : nList) {
            System.out.println(primeCnt(x));
        }
    }

    private static int primeCnt(int x) {
        int cnt = 0;
        for (int i = x + 1; i <= 2 * x; i++) {
            if (!prime[i]) cnt++;
        }

        return cnt;
    }

    private static void prime() {
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i ; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
