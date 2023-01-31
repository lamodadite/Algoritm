package BOJ.boj2231;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int temp = 0;
        for (int i = 1; i < N; i++) {
            temp = 0;
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                temp += String.valueOf(i).toCharArray()[j] - '0';
            }
            if (i + temp == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
