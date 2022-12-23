package boj1269;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> AminusB = new HashSet<>();
        Set<Integer> BminusA = new HashSet<>();

        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        for (int i = 0; i < M; i++) {
            B.add(sc.nextInt());
        }

        for (int x : A) {
            if (!(B.contains(x))) {
                AminusB.add(x);
            }
        }
        for (int x : B) {
            if (!(A.contains(x))) {
                BminusA.add(x);
            }
        }
        System.out.println(AminusB.size() + BminusA.size());
    }
}
