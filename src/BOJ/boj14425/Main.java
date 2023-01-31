package BOJ.boj14425;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();
        sc.nextLine();
        Set<String> S = new HashSet<>();
        for (int i = 0; i < N; i++) {
            S.add(sc.nextLine());
        }

        int cnt = 0;
        for (int i = 0; i < M; i++) {
            if (S.contains(sc.nextLine())) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
