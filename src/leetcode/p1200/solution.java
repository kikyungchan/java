package leetcode.p1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<Integer> input = new ArrayList<>();
        for (int n : arr) {
            input.add(n);
        }
        int MINDIFF = Integer.MAX_VALUE;

        List<List<Integer>> result = new ArrayList<>();
        // 1. input 정렬
        Collections.sort(input);
        // 2. 인접한 두개씩(i,i+1) 값의 차가 가장 적은 차이를 구해서 저장
        for (int i = 0; i < input.size() - 1; i++) {

            int DIFF = input.get(i + 1) - input.get(i);
            if (DIFF < MINDIFF) {
                MINDIFF = DIFF;
            }
        }
        // 3. 인접한 두 값의 차가 (2번에서 구한거)와 값과 같으면
        for (int i = 0; i < input.size() - 1; i++) {
            int DIFF = input.get(i + 1) - input.get(i);
            if (DIFF == MINDIFF) {
                result.add(Arrays.asList(input.get(i), input.get(i + 1)));
            }
        }

        // 두 값을 원소로 같는 List를 만들어서
        // 결과 list에 추가하기(list.add)
        // 리턴
        return result;
    }

}