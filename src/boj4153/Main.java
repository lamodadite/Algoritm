package boj4153;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x  = 0, y = 0, z = 0;
        while (true) {
            x =  sc.nextInt();
            y =  sc.nextInt();
            z =  sc.nextInt();
            if (x == 0) break;
            if ((x * x) + (y * y) == z*z) {
                System.out.println("right");
            } else if ((x * x) + (z * z) == y*y){
                System.out.println("right");
            } else if ((y * y) + (z * z) == x*x) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
