package boj2869;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B = sc.nextInt(), V = sc.nextInt();

        System.out.println((V-A)/(A-B) + 1);
    }
}
