package 프로그래머스.Level0.문자열정렬하기1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> suja = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) {
                suja.add(c - '0');
            }
        }
        Collections.sort(suja);
        int[] answer = new int[suja.size()];
        for (int i = 0; i < suja.size(); i++) {
            answer[i] = suja.get(i);
        }

        return answer;
    }
}