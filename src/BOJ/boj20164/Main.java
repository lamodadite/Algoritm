package BOJ.boj20164;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



    }

    static int getOddCnt(String num) {
        int cnt = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) % 2 == 1) {
                cnt++;
            }
        }
        return cnt;
    }
}
