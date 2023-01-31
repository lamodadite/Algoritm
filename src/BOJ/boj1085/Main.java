package BOJ.boj1085;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = sc.nextInt(),
                w = sc.nextInt(), h = sc.nextInt();

        System.out.println(IntStream.of(x, y, w - x, h - y).min().getAsInt());
    }
}
