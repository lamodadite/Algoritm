package BOJ.boj1300;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();

        long lo = 1;
        long hi = k;

        while (lo < hi) {

            long mid = lo + (hi - lo) / 2;
            long cnt = 0;

            for (int i = 1; i <= N; i++) {
                cnt += Math.min(N, mid / i);
            }

            if (k <= cnt) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        System.out.println(lo);
    }
}
