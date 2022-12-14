package boj2750;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIdx = j;
                }
            }
            swap(i, minIdx);
        }
    }

    private static void swap(int i, int minIdx) {
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
    }
}
