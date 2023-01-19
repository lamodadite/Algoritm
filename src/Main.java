import java.util.*;
import java.io.*;

public class Main{
    public static int[] lines;
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt(); // 이미 갖고 있는 랜선의 개수
        int n = sc.nextInt(); // 필요한 랜선의 개수
        lines = new int[k];
        long max = 0;
        for (int i = 0; i < k; i++) {
            lines[i] = sc.nextInt();
            if (max < lines[i]) {
                max = lines[i];
            }
        }

        System.out.println(upperBound(1, max + 1, n) - 1);
    }

    private static long upperBound(long lo, long hi, int target) {

        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;
            long cnt = Arrays.stream(lines).mapToLong(x -> x / mid).sum();
            if (cnt < target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}