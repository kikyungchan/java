package 프로그래머스.코딩기초문제.카운트다운;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> list = new ArrayList<>();
        for (int i = start_num; i >= end_num; i--) {
            list.add(i);
        }
        int[] answer = new int[start_num - end_num + 1];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
