package leetcode.p442;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        //전체탐색
        for (int n : nums) {
            if (!set.add(n)) {
                result.add(n);
            }
        }
        //겹치는놈 추가 어디에? 결과에
        //그걸 담을 새로운 리스트
        //결과에 리턴
        return result;
    }
}