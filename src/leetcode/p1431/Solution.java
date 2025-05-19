package leetcode.p1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> kids = Arrays.stream(candies).boxed().toList();


        // List<Boolean> 객체 만들기
        List<Boolean> result = new ArrayList<>();
        //기준이 되는 값
        int a = candies[0];
        //kids List에서 가장 큰 값 구하기
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > a) {
                a = candies[i];
            }
        }
        // kids의 각 요소에 extraCandy 더해서 (1에서 구한 가장 큰값)보다
        // 크거나 같으면 result에 true 추가 아니면 false 추가

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= a) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}