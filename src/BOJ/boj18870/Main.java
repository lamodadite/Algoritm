package BOJ.boj18870;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int x : sortedArr) {
            if (!map.containsKey(x)) {
                map.put(x, count);
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : arr) {
            int ranking = map.get(key);
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);
    }
}
