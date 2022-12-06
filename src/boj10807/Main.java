package boj10807;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> numList = new ArrayList<>(N);
        IntStream.range(0, N).forEach(i -> numList.add(sc.nextInt()));
        int v = sc.nextInt();
        long count = numList.stream().filter(i -> i == v).count();
        System.out.println(count);

    }
}
