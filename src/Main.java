import java.util.*;
import java.io.*;

public class Main{
    public static int[] arr = {1, 2, 3, 3, 3, 3, 4, 5, 6, 6, 7};
    public static void main(String[] args) throws IOException {


        int target = 7;

        System.out.println(lowerBound(0, arr.length - 1, target));
        System.out.println(upperBound(0, arr.length - 1, target));
    }

    private static int lowerBound(int min, int max, int target) {
        int lo = min;
        int hi = max;

        while (lo < hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    private static int upperBound(int min, int max, int target) {
        int lo = min;
        int hi = max;

        while (lo < hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] <= target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }


}