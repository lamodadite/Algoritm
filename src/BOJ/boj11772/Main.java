package BOJ.boj11772;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            int base = Integer.parseInt(temp.substring(0, temp.length()-1));
            int exponent = Integer.parseInt(String.valueOf(temp.charAt(temp.length()-1)));
            answer += Math.pow(base, exponent);
        }
        System.out.println(answer);
    }
}
