package programmers;

public class 올바른괄호 {
    boolean solution(String s) {
        int cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char temp = s.charAt(i);
            if (temp == ')') {
                cnt++;
            } else {
                cnt--;
            }
            if (cnt < 0) {
                break;
            }
        }

        return cnt == 0 ? true : false;
    }
}
