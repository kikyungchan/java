package 프로그래머스.코딩기초문제.중앙값구하기;

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int i1 = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 == 0) {
                i1 = array[array.length] / 2;
            } else {
                i1 = (array[array.length] / 2) + 1;
            }
        }
        return i1;
    }
}

