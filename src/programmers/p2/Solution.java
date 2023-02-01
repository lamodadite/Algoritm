package programmers.p2;

import java.util.*;

class Solution {
    public static int[] solution(int[] fees, String[] records) {
        ArrayList<Integer> answerList = new ArrayList<>();
        // fees -> 0 : 기본 시간, 1 : 기본 요금, 2 : 단위 시간, 3 : 단위 요금

        List<String> recordsList = new ArrayList<>(Arrays.asList(records));


        recordsList.sort(Comparator.comparing(o -> o.split(" ")[1]));

        String preCarNumber = recordsList.get(0).split(" ")[1];
        ArrayList<String> time = new ArrayList<>();
        time.add(recordsList.get(0).split(" ")[0]);


        for (int i = 1; i < recordsList.size(); i++) {
            String[] split = recordsList.get(i).split(" ");
            // 0 : 시간, 1 : 차량 번호, 2 : IN/OUT
            if (!preCarNumber.equals(split[1])) {
                answerList.add(getPrice(fees, time));
                time.clear();
                time.add(split[0]);
                preCarNumber = split[1];
                continue;
            }
            time.add(split[0]);
        }
        answerList.add(getPrice(fees, time));

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) answer[i] = answerList.get(i);
        return answer;
    }

    private static int getPrice(int[] fees, ArrayList<String> timeList) {
        if (timeList.size() % 2 != 0) {
            timeList.add("23:59");
        }

        int time = 0;

        Stack<Integer> stack = new Stack<>();

        for (String s : timeList) {
            String[] splits = s.split(":");
            int temp = Integer.parseInt(splits[0]) * 60 + Integer.parseInt(splits[1]);
            stack.push(temp);
        }

        while (!stack.isEmpty()) {
            int outTime = stack.pop();
            int inTime = stack.pop();
            time += outTime - inTime;
        }

        if (time <= fees[0]) {
            return fees[1];
        } else {
            time -= fees[0];
            return time % fees[2] == 0? // 올림 처리 중요
                    fees[1] + ((time / fees[2]) * fees[3]) : fees[1] + (((time / fees[2]) + 1) * fees[3]);
        }
    }
}

class Test {
    public static void main(String[] args) {

        int[] fees = {120, 0, 60, 591};
        String[] records = {"16:00 3961 IN", "16:00 0202 IN", "18:00 3961 OUT", "18:00 0202 OUT", "23:58 3961 IN"};

        System.out.println(Arrays.toString(Solution.solution(fees, records)));
    }
}
