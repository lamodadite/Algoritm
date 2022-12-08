package boj2908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb1 = new StringBuffer(sc.next());
        StringBuffer sb2 = new StringBuffer(sc.next());

        int num1 = Integer.parseInt(sb1.reverse().toString());
        int num2 = Integer.parseInt(sb2.reverse().toString());

        System.out.println(num1 >= num2 ? num1 : num2);


    }
}
