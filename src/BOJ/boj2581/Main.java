package BOJ.boj2581;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static boolean[] prime;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt(), N = sc.nextInt();

        prime = new boolean[N+1];

        prime();

        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            if (!prime[i]) {
                numList.add(i);
            }
        }
        if (numList.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(numList.stream().mapToInt(i -> i).sum());
            System.out.println(numList.stream().mapToInt(i -> i).min().getAsInt());
        }
    }

    public static void prime() {
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
