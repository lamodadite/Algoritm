package boj2751;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
             list.add(sc.nextInt());
        }

        Collections.sort(list);

        list.forEach(System.out::println);

        String s = "dd";}
}
