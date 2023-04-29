import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

class Solution {

    static boolean[] primes;

    public static void main(String[] args) {

        int N = 10000;

        make_primes(N);


        System.out.println(primes[12]);



    }

    private static void make_primes(int n) {
        primes = new boolean[n + 1];

        if (n < 2) {
            return;
        }

        primes[0] = primes[1] = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i]) continue;
            for (int j = i * i; j < primes.length; j = j + i) {
                primes[j] = true;
            }
        }


    }

}