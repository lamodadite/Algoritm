package BOJ.boj6549;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] histogram;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());

            if (n == 0) break;
            histogram = new int[n];
            for (int i = 0; i < n; i++) {
                histogram[i] = Integer.parseInt(st.nextToken());
            }

            sb.append(getArea(0, n - 1)).append("\n");

            histogram = null;
        }

        System.out.println(sb);

    }

    private static long getArea(int lo, int hi) {

        if (lo == hi) {
            return histogram[lo];
        }

        int mid = lo + (hi - lo) / 2;

        long leftArea = getArea(lo, mid);
        long rightArea = getArea(mid + 1, hi);

        long max = Math.max(leftArea, rightArea);

        return Math.max(getMidArea(lo, hi, mid), max);
    }

    private static long getMidArea(int lo, int hi, int mid) {

        int toLeft = mid;
        int toRight = mid;

        long height = histogram[mid];

        long maxArea = height;

        while (lo < toLeft && toRight < hi) {

            if (histogram[toLeft - 1] < histogram[toRight + 1]) {
                toRight++;
                height = Math.min(height, histogram[toRight]);
            } else {
                toLeft--;
                height = Math.min(height, histogram[toLeft]);
            }

            maxArea = Math.max(maxArea, height * (toRight - toLeft + 1));
        }

        while (toLeft > lo) {
            toLeft--;
            height = Math.min(height, histogram[toLeft]);
            maxArea = Math.max(maxArea, height * (toRight - toLeft + 1));
        }

        while (toRight < hi) {
            toRight++;
            height = Math.min(height, histogram[toRight]);
            maxArea = Math.max(maxArea, height * (toRight - toLeft + 1));
        }

        return maxArea;
    }
}
