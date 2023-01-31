package BOJ.boj2565;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] dp = new int[N];

        int[][] wire = new int[N][2];

        for(int i = 0; i < N; i++) {

            wire[i][0] = in.nextInt();
            wire[i][1] = in.nextInt();
        }

        Arrays.sort(wire, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });


        for(int i = 0; i < dp.length; i++) {

            dp[i] = 1;

            for(int j = 0; j < i; j++) {
                if(wire[i][1] > wire[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        System.out.println(N - Arrays.stream(dp).max().getAsInt());

    }

}
