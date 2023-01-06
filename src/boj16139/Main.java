package boj16139;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int q = Integer.parseInt(br.readLine());
        int[][] prefixSum = new int[s.length() + 1][27];
        prefixSum[1][s.charAt(0) - 'a']++;

        for (int i = 2; i <= s.length(); i++) {
            int idx = s.charAt(i - 1) - 'a';
            for (int j = 0; j < 26; j++) {
                int before = prefixSum[i - 1][j];
                prefixSum[i][j] = j == idx ? before + 1 : before;
            }
        }

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            //문제 문자
            int idx = st.nextToken().charAt(0) - 'a';
            //시작점
            int start = Integer.parseInt(st.nextToken()) + 1;
            //끝점
            int end = Integer.parseInt(st.nextToken()) + 1;
            //끝점의 누적합 - 시작점 바로 이전의 누적합 = 구간의 문자 반복값
            sb.append((prefixSum[end][idx] - prefixSum[start - 1][idx]) + "\n");
        }
        br.close();

        System.out.println(sb);
    }
}
