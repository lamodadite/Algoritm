package programmers.p3;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static ArrayList<String> answer = new ArrayList<>();
    public static StringBuilder sb = new StringBuilder();
    public static String[] orderArr;
    public static boolean[] visited;
    public static int max;
    public static ArrayList<String> maxValueList;
    public static String[] solution(String[] orders, int[] course) {
        orderArr = orders;
        HashSet<String> menuSet = new HashSet<>();
        for (String order : orders) {
            menuSet.addAll(Arrays.asList(order.split("")));
        }
        String[] menuArr = menuSet.toArray(new String[0]);
        visited = new boolean[menuArr.length];
        for (int x : course) {
            max = 2;
            maxValueList = new ArrayList<>();
            getCourse(0, menuArr, x);
            answer.addAll(maxValueList);
        }
        answer.sort(Comparator.naturalOrder());
        return answer.toArray(new String[0]);
    }

    private static void getCourse(int startIdx, String[] menuArr, int depth) {
        if (depth == 0) {
            int cnt = 0;
            for (String s : orderArr) {
                boolean flag = true;
                for (String s1 : sb.toString().split("")) {
                    if (!s.contains(s1)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    cnt++;
                }
            }
            if (cnt == max) {
                maxValueList.add(sb.toString());
            } else if (cnt > max) {
                max = cnt;
                maxValueList = new ArrayList<>();
                maxValueList.add(sb.toString());
            }
            return;
        }

        for (int i = startIdx; i < menuArr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sb.append(menuArr[i]);
                getCourse(i + 1, menuArr, depth - 1);
                visited[i] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
        }

    }
}

class Test {
    public static void main(String[] args) {

        String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        int[] course = {2,3,5};

        System.out.println(Arrays.toString(Solution.solution(orders, course)));
    }
}
