package BOJ.boj11478;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        Set<String> set = new HashSet<>();
        String name = "";
        for (int i = 0; i < s.length(); i++) {
                name = "";
            for (int j = i; j < s.length(); j++) {
                name += s.substring(i, j + 1);
                set.add(name);
            }
        }
        System.out.println(set.size());
    }
}
