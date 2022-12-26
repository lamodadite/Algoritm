
package boj2981;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int gcdValue = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            gcdValue = gcd(gcdValue, arr[i]-arr[i-1]);
        }

        for (int i = 2; i <= gcdValue; i++) {
            if (gcdValue % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static int gcd(int x, int y) {
        while (true) {
            if (y == 0) {
                break;
            }
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}
