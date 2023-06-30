package BOJ.boj1072;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = 100 * y / x;

        if (z >= 99) {
            System.out.println(-1);
        } else {
            binarySearch(x, y, z);
        }
    }

    private static void binarySearch(long x, long y, long z) {
        long l = 0;
        long h = 1000000000;
        long mid = 0;

        while (l <= h) {
            mid = (l + h) / 2;
            if (z < 100 * (y + mid) / (x + mid)) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(l);
    }
}
