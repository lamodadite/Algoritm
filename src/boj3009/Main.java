package boj3009;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] xlist = new int[3];
        int[] ylist = new int[3];
        for (int i = 0; i < 3; i++) {
            xlist[i] = sc.nextInt();
            ylist[i] = sc.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        int answer = 0;
        for (int x : xlist) {
            if (set.contains(x)) {
                answer = x;
                break;
            }
            set.add(x);
        }
        for (int x : xlist) {
            if (x != answer) {
                answer = x;
                break;
            }
        }
        System.out.print(answer + " ");

        set.clear();
        answer = 0;
        for (int x : ylist) {
            if (set.contains(x)) {
                answer = x;
                break;
            }
            set.add(x);
        }
        for (int x : ylist) {
            if (x != answer) {
                answer = x;
                break;
            }
        }
        System.out.print(answer);
    }
}
