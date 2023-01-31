package BOJ.boj1541;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] split = s.split("-");
        int result = toInteger(split[0]);
        for (int i = 1; i < split.length; i++) {
            result -= toInteger(split[i]);
        }

        System.out.println(result);

    }

    private static int toInteger(String s) {
        String[] split = s.split("\\+");
        return Arrays.stream(split).mapToInt(o -> Integer.parseInt(o)).sum();
    }
}
