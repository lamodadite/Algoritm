package p1;

class Solution {
    static int[] arr, dp;
    public static int solution(int[] nums) {
        int answer = 0;
        arr = nums;
        dp = new int[arr.length];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            int idx = lowerBound(arr[i], 0, cnt, cnt + 1);

            if (idx == -1) {
                dp[cnt++] = arr[i];
            } else {
                dp[idx] = arr[i];
            }
        }
        return cnt;
    }

    private static int lowerBound(int num, int start, int end, int size) {
        int result = 0;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (num <= dp[mid]) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (start == size) {
            return -1;
        } else {
            return result;
        }
    }
}
class Test {
    public static void main(String[] args) {

        int[] nums = {6, 2, 4, 6, 11, 9, 9, 10};

        System.out.println(Solution.solution(nums));
    }
}
