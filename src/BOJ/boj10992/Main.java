package BOJ.boj10992;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i == N) {
                for (int j = 1; j <= i*2 - 1; j++) {
                    System.out.print("*");
                }
                break;
            }

            for (int j = 1; j <= N-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                if (j == 1 || j == 2*i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
