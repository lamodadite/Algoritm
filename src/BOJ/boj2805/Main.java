package BOJ.boj2805;

import java.util.Scanner;

public class Main {
    public static int[] trees;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 나무의 수
        int m = sc.nextInt(); // 집으로 가져가려는 나무의 길이
        trees = new int[n];

        long max = 0;
        for (int i = 0; i < n; i++) {
            trees[i] = sc.nextInt();
            if (max < trees[i]) {
                max = trees[i];
            }
        }

        long min = 0;

        while (min < max) {

            long mid = min + (max - min) / 2;
            long length = 0;
            for (int tree : trees) {
                if (tree > mid) {
                    length += tree - mid;
                }
            }

            if (length < m) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min - 1);
    }
}
