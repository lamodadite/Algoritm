package boj2108;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        int sum = list.stream().mapToInt(o -> o).sum();
        int max = list.stream().mapToInt(o -> o).max().getAsInt();
        int min = list.stream().mapToInt(o -> o).min().getAsInt();

        // 최빈값 구하기
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : list) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int mode = map.values().stream().mapToInt(o -> o).max().getAsInt();

        List<Integer> modeList = new ArrayList<>();
        for (int x : map.keySet()) {
            if (map.get(x) == mode) {
                modeList.add(x);
            }
        }
        Collections.sort(modeList);

        System.out.println(Math.round((double) sum/(double) N));
        System.out.println(list.get(N/2));
        System.out.println(modeList.size() == 1 ? modeList.get(0) : modeList.get(1));
        System.out.println(max-min);

    }
}
