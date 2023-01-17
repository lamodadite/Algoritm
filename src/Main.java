import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int j = 1; j <= N; j++) {
            for(int i = N - 1; i >= j; i--) {
                System.out.print(" ");
            }

            for(int i = 1; i <= j; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}