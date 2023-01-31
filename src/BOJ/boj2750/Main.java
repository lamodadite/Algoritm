package BOJ.boj2750;

import java.util.Arrays;
import java.util.Scanner;

// 선택 정렬
//public class Main {
//    public static int[] arr;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//
//        arr = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        selectionSort(arr);
//
//        Arrays.stream(arr).forEach(System.out::println);
//    }
//
//    private static void selectionSort(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int min = arr[i];
//            int minIdx = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (min > arr[j]) {
//                    min = arr[j];
//                    minIdx = j;
//                }
//            }
//            swap(i, minIdx);
//        }
//    }
//
//    private static void swap(int i, int minIdx) {
//        int temp = arr[i];
//        arr[i] = arr[minIdx];
//        arr[minIdx] = temp;
//    }
//}

//삽입 정렬
//public class Main {
//    public static int[] arr;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//
//        if (N == 1) {
//            System.out.println(1);
//            return;
//        }
//        arr = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//        sc.close();
//
//        insertionSort();
//
//        Arrays.stream(arr).forEach(System.out::println);
//    }
//
//    private static void insertionSort() {
//        for (int i = 1; i < arr.length; i++) {
//            while (i > 0) {
//                if (arr[i-1] > arr[i]) {
//                    swap(i, i-1);
//                }
//                i--;
//            }
//        }
//    }
//
//    private static void swap(int i, int minIdx) {
//        int temp = arr[i];
//        arr[i] = arr[minIdx];
//        arr[minIdx] = temp;
//    }
//}

// 버블 정렬
public class Main {
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        bubleSort();

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void bubleSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    private static void swap(int i, int minIdx) {
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
    }
}