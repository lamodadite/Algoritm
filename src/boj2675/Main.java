package boj2675;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            String[] sArray = s.split("");
            String answer = Arrays.stream(sArray).map(o -> o.repeat(n)).collect(Collectors.joining());
            System.out.println(answer);
        }
        sc.close();
    }
}
