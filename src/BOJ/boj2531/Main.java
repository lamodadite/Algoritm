package BOJ.boj2531;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 접시 수
        int d = sc.nextInt(); // 초밥의 가짓수
        int k = sc.nextInt(); // 연속해서 먹는 접시의 수
        int c = sc.nextInt(); // 쿠폰 번호
        int max = 0;
        int[] table = new int[n];

        for (int i = 0; i < n; i++) {
            table[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        set.add(c);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < i + k; j++) {
                set.add(table[j % n]);
            }
            max = Math.max(max, set.size());
            set.clear();
            set.add(c);
        }

        System.out.println(max);
    }
}
