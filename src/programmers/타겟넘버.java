package programmers;

public class 타겟넘버 {
    class Solution {
        static int[] arr;
        static int t;
        static int cnt;
        public int solution(int[] numbers, int target) {
            arr = numbers;
            t = target;
            dfs(0, 0);
            return cnt;
        }
        private void dfs(int depth, int sum) {
            if (depth == arr.length) {
                if (sum == t) {
                    cnt++;
                }
                return;
            }
            dfs(depth + 1, sum + arr[depth]);
            dfs(depth + 1, sum - arr[depth]);
        }
    }
}
