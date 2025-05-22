package leetcode.p1748;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

class Solution {
    public int sumOfUnique(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//// nums 전체 탐색해서 각 아이템이 몇번 나오는지 새기
//        for (int n : nums) {
//            //n이 맵에 있으면
//            if (map.containsKey(n)) {
//                Integer v = map.get(n);
//                map.put(n, v + 1);
//            } else {
//                //n이 맵에 없음ㄴ
//                map.put(n, 1);
//            }
//        }
//        int sum = 0;
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == 1) {
//                sum += entry.getKey();
//            }
//        }
//        return sum;
        return Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .mapToInt(e -> e.getKey())
                .sum();

    }
}
