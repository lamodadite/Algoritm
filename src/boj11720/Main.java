package boj11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String number = sc.next();
        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer += number.charAt(i) - '0';
        }
        System.out.println(answer);
    }
}
