package programmers.week12.p1;

class Solution {
    public static int solution(int n, int k) {
        int answer = 0;

        // k진수의 길이 구하기
        int maxDigit = upperBound(n, k);
        // k진수로 변환
        String convertedNum = convert(n, k, maxDigit);
        // 0을 기준으로 split
        String[] nums = convertedNum.split("0");
        for (String num : nums) {
            if (num.length() == 0) continue; // 빈 문자열일 경우 pass
            if (isPrime(Long.parseLong(num))) { // num이 int범위를 넘을 수 있으므로 Long으로 바꿔줘야 함
                answer++;
            }
        }
        return answer;
    }

    private static boolean isPrime(long num) {
        if (num == 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static String convert(int n, int k, int maxDigit) {
        StringBuilder sb = new StringBuilder();
        
        while(maxDigit >= 0) {
            int temp = (int) Math.pow(k, maxDigit);
            sb.append(n / temp);
            n %= temp;
            maxDigit--;
        }
        
        return sb.toString();
    }

    private static int upperBound(int target, int k) {
        int lo = 0;
        int hi = 15;

        while (lo < hi) {
            int mid = (hi + lo) / 2;
            int midValue = (int) Math.pow(k, mid);

            if (target >= midValue) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo - 1;
    }
}
class Test {
    public static void main(String[] args) {

        int n = 1000000;
        int k = 10;

        System.out.println(Solution.solution(n, k));
    }
}
