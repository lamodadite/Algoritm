package BOJ.boj2684;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String[] coinSeq = {"TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT", "HHH"};

        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String sequence = sc.next();

            for (String x : coinSeq) {
                cnt = 0;
                for (int j = 0; j < sequence.length() - 2; j++) {
                    if (x.equals(sequence.substring(j, j + 3))) {
                        cnt++;
                    }
                }
                System.out.print(cnt + " ");
            }
            System.out.println();
        }
    }
}
