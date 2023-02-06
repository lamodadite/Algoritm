package BOJ.boj2869;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B = sc.nextInt(), V = sc.nextInt();

        int x = (V - A) / (A - B) + 1;
        if ((V - A) % (A - B) == 0) {
            System.out.println(x - 1);
        } else {
            System.out.println(x);
        }
    }
}
