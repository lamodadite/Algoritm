package boj1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = s.strip();
        if ("".equals(s)) {
            System.out.println(0);
            return;
        }

        System.out.println(s.split(" ").length);

    }
}
