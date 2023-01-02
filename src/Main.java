import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] arr = {4, 4, 2, 5, 8, 5, 1, 2, 4, 5};

    public static void main(String[] args) {


        merge_sort(0, arr.length -1);

        System.out.println(Arrays.toString(arr));
    }

    private static void merge_sort(int left, int right) {

        if (right == left) {
            return;
        }

        int mid = left + (right - left) / 2;

        merge_sort(left, mid);
        merge_sort(mid + 1, right);
        merge(left, mid, right);
    }

    private static void merge(int left, int mid, int right) {
        int[] sortedArr = new int[arr.length];

        int l = left;
        int r = mid + 1;
        int idx = left;

        while (l <= mid && r <= right) {
            if (arr[r] < arr[l]) {
                sortedArr[idx] = arr[r];
                r++;
                idx++;
            } else {
                sortedArr[idx] = arr[l];
                l++;
                idx++;
            }
        }

        if (l > mid) {
            while (r <= right) {
                sortedArr[idx] = arr[r];
                r++;
                idx++;
            }
        } else {
            while (l <= mid) {
                sortedArr[idx] = arr[l];
                l++;
                idx++;
            }
        }

        for (int i = left; i <= right; i++) {
            arr[i] = sortedArr[i];
        }
    }

}