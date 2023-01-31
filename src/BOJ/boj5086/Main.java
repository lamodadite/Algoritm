package BOJ.boj5086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        while (true) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x == 0 && y == 0) {
                break;
            }
            if (isFactor(x, y)) {
                System.out.println("factor");
            } else if (isMultiple(x, y)) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }

    private static boolean isMultiple(int x, int y) {
        return x > y && x % y == 0;
    }

    private static boolean isFactor(int x, int y) {
        return x < y && y % x == 0;
    }
}
