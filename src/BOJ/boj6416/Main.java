package BOJ.boj6416;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Point> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int from, to;
        int k = 1;
        while (true) {
            from = sc.nextInt();
            to = sc.nextInt();
            if (from < 0 && to < 0) break;
            if (from == 0 && to == 0) {
                if (isTree(list)) {
                    sb.append("Case " + k + " is a tree.").append("\n");
                } else {
                    sb.append("Case " + k + " is not a tree.").append("\n");
                }
                k++;
                list.clear();
                continue;
            }
            if (list.isEmpty()) {
                list.add(new Point(from, to));
            } else {
                for (int i = 0; i < list.size(); i++) {
                    Point p = list.get(i);
                    if (p.y == from) {
                        from = p.x;
                    } else if (p.x == to) {
                        list.get(i).x = from;
                    }
                }
                list.add(new Point(from, to));
            }
        }
        System.out.println(sb);
    }

    private static boolean isTree(ArrayList<Point> list) {
        if (list.isEmpty()) return true;
        int root = list.get(0).x;
        for (Point p : list) {
            if (p.x != root) return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for (Point p : list) {
            if (set.contains(p.y)) return false;
            else set.add(p.y);
        }
        return true;
    }
}

