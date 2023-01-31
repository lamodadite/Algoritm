package BOJ.boj7568;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<int[]> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < N; i++) {
            int[] temp = new int[2];
            temp[0] = sc.nextInt();
            temp[1] = sc.nextInt();
            list.add(temp);
        }
        int cnt; // 나보다 덩치가 큰사람의 수
        for (int i = 0; i < N; i++) {
            cnt = 0;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                  continue;
                }
                if (list.get(j)[0] > list.get(i)[0]
                    && list.get(j)[1] > list.get(i)[1]) {
                    cnt++;
                }
            }
            sb.append(cnt+1).append(" ");
        }
        System.out.println(sb);
    }
}
