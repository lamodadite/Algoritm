package BOJ.boj2566;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int row = -1, col = -1;


        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int n = sc.nextInt();
                if (n >= max) {
                    max = n;
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + col);
    }
}
