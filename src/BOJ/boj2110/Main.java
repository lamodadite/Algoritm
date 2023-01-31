package BOJ.boj2110;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static long[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 집의 개수
        int C = sc.nextInt(); // 공유기의 개수
        arr = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        System.out.println(upper_bound(1, arr[N-1] - arr[0] + 1, C));
    }

    private static long upper_bound(long lo, long hi, int C) {

        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;

            if (canInstall(mid) >= C) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        return lo - 1;
    }

    private static long canInstall(long dis) {

        long cnt = 1;
        long lastLocate = arr[0];

        for (int i = 1; i < arr.length; i++) {
            long locate = arr[i];
            if (locate - lastLocate >= dis) {
                cnt++;
                lastLocate = locate;
            }
        }
        return cnt;
    }
}
