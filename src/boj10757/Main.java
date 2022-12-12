package boj10757;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        BigInteger bi1 = new BigInteger(A);
        BigInteger bi2 = new BigInteger(B);
        System.out.println(bi1.add(bi2).toString());
    }
}
