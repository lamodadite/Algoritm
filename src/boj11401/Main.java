package boj11401;

import java.util.Scanner;

public class Main {

    final static long p = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), K = sc.nextInt();

        long numer = factorial(N);
        long denom = factorial(K) * factorial(N - K) % p;

        System.out.println(numer * pow(denom, p - 2) % p);


    }

    private static long pow(long base, long expo) {
        long result = 1;

        while (expo > 0) {
            if (expo % 2 == 1) {
                result *= base;
                result %= p;
            }
            base = (base * base) % p;
            expo /= 2;
        }

        return result;
    }

    private static long factorial(int n) {
        long value = 1L;

        while(n > 1) {
            value = (value * n) % p;
            n--;
        }
        return value;
    }
}
