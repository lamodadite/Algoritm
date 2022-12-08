package boj1316;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            Set<String> set = new HashSet<>();
            String temp = sc.next();
            String[] strings = temp.split("");
            for (int j = 0; j < strings.length; j++) {
                if (j == 0) {
                    set.add(strings[j]);
                    continue;
                }
                if (strings[j].equals(strings[j-1])) {
                    answer--;
                    break;
                }
                if (set.contains(strings[j])) {
                    answer--;
                    break;
                } else {
                    set.add(strings[j]);
                }
            }
            answer++;
        }
        System.out.println(answer);
    }
}
