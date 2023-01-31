package BOJ.boj5597;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        IntStream.range(0, 28).forEach(o -> numList.add(sc.nextInt()));

        Collections.sort(numList);

        for (int i = 1; i < 31; i++) {
            if (!numList.contains(i)) {
                System.out.println(i);
            }
        }

    }
}
