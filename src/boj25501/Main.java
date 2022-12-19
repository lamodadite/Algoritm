package boj25501;

import java.util.Scanner;

public class Main {
    public static int recursionCnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] arr = new String[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        recursionCnt = 1;
        for (String x : arr) {
            System.out.println(isPalindrome(x) + " " + recursionCnt);
            recursionCnt = 1;
        }
    }
    public static int recursion(String s, int l, int r){
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else {
            recursionCnt++;
            return recursion(s, l + 1, r - 1);
        }
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}
