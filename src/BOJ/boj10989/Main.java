package BOJ.boj10989;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int max = -1;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] counting = new int[max + 1];
        int[] result = new int[N];

        // counting 배열 채우기

        for (int i = 0; i < N; i++) {
            counting[arr[i]]++;
        }
        // 누적합
        for (int i = 1; i < counting.length; i++) {
            counting[i] += counting[i-1];
        }
        // result 배열 채우기
        for (int i = N - 1; i >= 0; i--) {
            int temp = arr[i];
            counting[temp]--;
            result[counting[temp]] = temp;
        }

        Arrays.stream(result).forEach(System.out::println);
    }
}
