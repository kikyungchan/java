package 프로그래머스.Level0.할일목록;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answer.add(todo_list[i]);
            }
        }
        return answer.toArray(new String[0]);
    }
}
