package boj2941;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<String> list = Arrays.asList("dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z=");
        for (String x : list) {
            if (str.contains(x)) {
                str = str.replace(x, "a");
            }
        }
        System.out.println(str.length());
    }
}
