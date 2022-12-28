import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 3, 5, 4, 2, 3, 7, 9, 5 ,3};

//        selection_sort(arr);
//        bubble_sort(arr);
        insertion_sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void selection_sort(int[] arr) {
        int min = Integer.MAX_VALUE;
        int minIdx = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIdx = j;
                }
            }
            if (arr[i] > min) {
                swap(arr, i, minIdx);
            }
            min = Integer.MAX_VALUE;
        }
    }

    static void bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    static void insertion_sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}