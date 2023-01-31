package BOJ.boj1037;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            list.add(x);
        }
        Collections.sort(list);

        System.out.println(list.get(0) * list.get(list.size()-1));
    }
}
