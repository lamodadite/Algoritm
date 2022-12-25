package boj1934;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int a, b;
        for (int i = 0; i < T; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(LCM(a, b));
        }
    }

    private static int LCM(int a, int b) {
        int r;
        int answer = a * b;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return answer / a;
    }
}
