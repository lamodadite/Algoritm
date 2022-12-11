package boj1193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int diagonalCnt = 1, accumulateSum = 0;
        while (true) {
            if (n <= accumulateSum + diagonalCnt) {
                break;
            }
            accumulateSum = accumulateSum + diagonalCnt;
            diagonalCnt++;
        }
        int A = n-accumulateSum;
        int B = diagonalCnt - (n - accumulateSum - 1);
        System.out.println(diagonalCnt % 2 == 0 ? String.valueOf(A) + "/" + String.valueOf(B) : String.valueOf(B) + "/" + String.valueOf(A));
    }
}
