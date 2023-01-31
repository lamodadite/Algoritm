package BOJ.boj2004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        long five = five_power(n) - five_power(m) - five_power(n - m);
        long two = two_power(n) - two_power(m) - two_power(n - m);

        System.out.println(Math.min(five, two));
    }

    static long five_power(long num) {
        int count = 0;

        while (num >= 5) {
            count += num / 5;
            num /= 5;
        }

        return count;
    }

    static long two_power(long num) {
        int count = 0;

        while (num >= 2) {
            count += num / 2;
            num /= 2;
        }

        return count;
    }
}
