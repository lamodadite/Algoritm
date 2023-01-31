package BOJ.boj1157;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] strings = s.toUpperCase().split("");
        Set<String> set = Arrays.stream(strings).collect(Collectors.toSet());

        HashMap<String, Integer> map = new HashMap<>();
        set.stream().forEach(i -> map.put(i, 0));

        for (String x : s.toUpperCase().split("")) {
            map.put(x, map.get(x) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> o : map.entrySet()) {
            if (max < o.getValue()) {
                max = o.getValue();
            }
        }
        boolean flag = false;
        for (Map.Entry<String, Integer> o : map.entrySet()) {
            if (o.getValue() == max) {
                if (flag) {
                    System.out.println("?");
                    return;
                }
                flag = true;
            }
        }
        for (Map.Entry<String, Integer> o : map.entrySet()) {
            if (o.getValue() == max) {
                System.out.println(o.getKey());
            }
        }

    }
}
