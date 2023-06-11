package BOJ.boj1106;

import java.util.*;

public class Main {
    static class City {
        int x;
        int y;

        public City(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int n = sc.nextInt();
        PriorityQueue<City> pq = new PriorityQueue<>((o1, o2) -> (o2.y * o1.x) - (o1.y * o2.x));
        for (int i = 0; i < n; i++) {
            pq.add(new City(sc.nextInt(), sc.nextInt()));
        }
        int answer = 0;
        City cur = pq.peek();
        if (cur.y <= c) {
            answer += (c / cur.y) * cur.x;
            c -= (c / cur.y) * cur.y;
        }

        if (c == 0) {
            System.out.println(answer);
            System.exit(0);
        }

        int min = Integer.MAX_VALUE;
        while (!pq.isEmpty()) {
            City curr = pq.poll();
            if (curr.y >= c) {
                min = Math.min(min, curr.x);
            } else {
                min = Math.min(min, c % curr.y == 0 ? c / curr.y : c / curr.y + 1);
            }
        }
        System.out.println(answer + min);



    }
}
