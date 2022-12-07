package boj10809;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        for (int i = 97; i < 123; i++) {
            System.out.print(word.indexOf((char) i));
            System.out.print(" ");
        }
    }
}
