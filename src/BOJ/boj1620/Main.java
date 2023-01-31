package BOJ.boj1620;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();
        sc.nextLine();

        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String temp = sc.nextLine();
            map.put(i, temp);
            map2.put(temp, i);
        }
        for (int i = 0; i < M; i++) {
            String temp = sc.nextLine();
            if (temp.chars().allMatch(Character::isDigit)) {
                System.out.println(map.get(Integer.parseInt(temp)));
            } else {
                System.out.println(map2.get(temp));
            }
        }
    }
}
