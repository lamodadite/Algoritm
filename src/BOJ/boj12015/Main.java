package BOJ.boj12015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        lis[0] = arr[0];
        int lisSize = 1;

        for (int i = 0; i < n; i++) {
            int key = arr[i];

            if (lis[lisSize - 1] < key) {
                lisSize++;
                lis[lisSize - 1] = key;
            } else {
                int lo = 0;
                int hi = lisSize;
                while (lo < hi) {
                    int mid = lo + (hi - lo) / 2;

                    if (lis[mid] < key) {
                        lo = mid + 1;
                    } else {
                        hi = mid;
                    }
                }
                lis[lo] = key;
            }
        }
        System.out.println(lisSize);

    }
}
