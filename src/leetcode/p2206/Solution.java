package leetcode.p2206;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        //전체탐색
        for (int n : nums) {
            if (map.containsKey(n)) {
                Integer v = map.get(n);
                map.put(n, v + 1);
                //짝수개인지 각 요소 count % 2 == 0?
            } else {
                map.put(n, 1);
            }
        }
        for (Integer v : map.values()) {
            if (v % 2 == 1) {
                return false;
            }
        }
        return true;
    }
}
