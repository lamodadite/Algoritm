import java.util.*;

class Solution {
    static boolean[] prime = new boolean[1001];
    static int answer = 0;
    static int[] arr = new int[3];

    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 6, 4};
        prime();
        reculsion(nums, 0, 0);

        System.out.println(answer);
    }

    private static void reculsion(int[] nums, int depth, int start) {
        if (depth == 3) {
            System.out.println(Arrays.toString(arr));
            if (!prime[Arrays.stream(arr).sum()]) {
                answer++;
            }
            return;
        }
        for (int i = start; i < nums.length; i++) {
            arr[depth] = nums[i];
            reculsion(nums, depth + 1, i + 1);
        }


    }

    public static void prime() {
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}