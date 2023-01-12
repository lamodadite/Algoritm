import java.util.Scanner;

public class Main {
    public static int[] arr;
    public static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        arr = new int[n];
        queen(0);

        System.out.println(cnt);
    }

    private static void queen(int depth) {
        if (depth == arr.length) {
            cnt++;
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[depth] = i;
            if (possible(depth)) {
                queen(depth + 1);
            }
        }
    }

    private static boolean possible(int col) {

        for (int i = 0; i < col; i++) {
            // 해당 열의 행과 i열의 행이 일치할경우 (같은 행에 존재할 경우)
            if (arr[col] == arr[i]) {
                return false;
            }

            // 대각선상에 놓여있는 경우
            // 열의 차와 행의 차가 같을 경우
            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }

        return true;
    }
}