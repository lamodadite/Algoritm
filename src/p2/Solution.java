package p2;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static int[][] solution(int[][] s, int[][] t) {
        int[] decodedS = decode(s);
        int[] decodedT = decode(t);
        int[] combined = new int[decodedS.length];
        for (int i = 0; i < decodedS.length; i++) {
            combined[i] = decodedT[i] * decodedS[i];
        }

        return RLE(combined);
    }

    private static int[] decode(int[][] ints) {
        StringBuilder sb = new StringBuilder();
        for (int[] x : ints) {
            for (int i = 0; i < x[1]; i++) {
                sb.append(x[0]);
            }
        }

        return Arrays.stream(sb.toString().split("")).mapToInt(Integer::parseInt).toArray();
    }

    private static int[][] RLE(int[] ints) {
        ArrayList<int[]> list = new ArrayList<>();
        int[] temp = new int[]{ints[0], 1};
        for (int i = 1; i < ints.length; i++) {
            if (ints[i - 1] != ints[i]) {
                list.add(temp);
                temp = new int[]{ints[i], 1};
            } else {
                temp[1]++;
            }
            if (i == ints.length - 1) {
                list.add(temp);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}

class Test {
    public static void main(String[] args) {

        int[][] s = {{1, 3}, {1, 4}};
        int[][] t = {{5, 2}, {3, 2}, {2, 3}};

        System.out.println(Arrays.deepToString(Solution.solution(s, t)));
    }
}
