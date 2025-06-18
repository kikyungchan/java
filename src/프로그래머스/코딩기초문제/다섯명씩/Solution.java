package 프로그래머스.코딩기초문제.다섯명씩;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] names) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < names.length; i += 5) {
            answer.add(names[i]);
        }
        return answer.toArray(new String[0]);
    }
}
