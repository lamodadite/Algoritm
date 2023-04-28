package programmers;

import java.util.*;

class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        int len = progresses.length;

        int max = 0;
        int cnt = 1;
        for (int i = 0; i < len; i++) {
            int val = (100 - progresses[i]) / speeds[i];
            int temp = (100 - progresses[i]) % speeds[i] > 0 ? val + 1 : val;

            if (i == 0) {
                max = temp;
                continue;
            }

            if (temp <= max) {
                cnt++;
                continue;
            }
            max = temp;
            list.add(cnt);
            cnt = 1;
        }
        list.add(cnt);


        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}