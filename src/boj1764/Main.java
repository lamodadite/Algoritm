package boj1764;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();
        sc.nextLine();

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String temp = sc.nextLine();
            set.add(temp);
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String temp = sc.nextLine();
            if (set.contains(temp)) {
                list.add(temp);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        list.forEach(System.out::println);
    }
}
