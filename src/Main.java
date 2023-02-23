import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

class Solution {


    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 6, 4};
        int[] answer = new int[nums.length];

        int[] newArr = Arrays.copyOfRange(nums, 1, 3);
        Arrays.sort(newArr);
        answer[1] = newArr[1];

        List<Integer> collect = Arrays.stream(nums).boxed().toList();
        int[] array = collect.stream().mapToInt(x -> x).toArray();

        System.out.println(Arrays.toString(newArr));
    }

}