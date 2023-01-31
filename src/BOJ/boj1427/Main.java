package BOJ.boj1427;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        int[] array = Arrays.stream(N.split("")).mapToInt(Integer::parseInt).toArray();
        int max = -1;
        int maxIdx = -1;
        for (int i = 0; i < array.length; i++) {
            max = array[i];
            maxIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxIdx = j;
                }
            }
            if (max > array[i]) {
                swap(array, maxIdx, i);
            }
        }
        Arrays.stream(array).forEach(System.out::print);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
