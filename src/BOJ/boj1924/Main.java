package BOJ.boj1924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        final String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int x = sc.nextInt(), y = sc.nextInt();
        int day = 1, month = 1, cnt = 1;
        String dayOfWeek = days[1];
        while (true) {
            if (month == x && day == y) {
                break;
            }
            day++;
            cnt++;
            dayOfWeek = days[cnt % 7];
            if (day > months[month]) {
                month++;
                day = 1;
            }
        }
        System.out.println(dayOfWeek);

    }
}
