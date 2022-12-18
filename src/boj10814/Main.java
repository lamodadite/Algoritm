package boj10814;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextLine());
        }
        sc.close();

        Collections.sort(list, Comparator.comparingInt(o -> Integer.parseInt(o.split(" ")[0])));

        list.forEach(System.out::println);
    }
}
