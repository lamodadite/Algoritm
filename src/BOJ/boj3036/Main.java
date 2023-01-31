package BOJ.boj3036;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int first = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int temp = sc.nextInt();
            int gcdValue = gcd(first, temp);
            System.out.println(first / gcdValue + "/" + temp / gcdValue);
        }
    }

    private static int gcd(int x, int y) {

        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }

        return x;
    }
}
