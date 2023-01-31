package programmers.p2;

import java.util.*;

class Solution {
    public static int[] solution(int[] fees, String[] records) {
        ArrayList<Integer> answerList = new ArrayList<>();
        // fees -> 0 : 기본 시간, 1 : 기본 요금, 2 : 단위 시간, 3 : 단위 요금

        List<String> recordsList = new ArrayList<>();
        for (String x : records) {
            recordsList.add(x);
        }

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
        String[] splits = timeList.get(timeList.size() - 1).split(":");
        int preTime = Integer.parseInt(splits[0]) * 60 + Integer.parseInt(splits[1]);
        for (int i = timeList.size() - 2; i >= 0; i--) {
            String[] split = timeList.get(i).split(":");
            if (i % 2 != 0) {
                preTime = Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
            } else {
                time += preTime - (Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]));
            }
        }
        if (time <= fees[0]) {
            return fees[1];
        } else {
            time -= fees[0];
            return time / fees[2] == 0?
                    fees[1] + fees[3] : fees[1] + ((time / fees[2]) * fees[3]);
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
