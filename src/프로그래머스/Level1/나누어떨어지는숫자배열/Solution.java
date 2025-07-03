package 프로그래머스.Level1.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer.add(arr[i]);
            }
        }

        Collections.sort(answer);

        if (answer.isEmpty()) {
            return new int[]{-1};
        }

        int[] answerList = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            answerList[i] = answer.get(i);
        }
        
        return answerList;
    }
}
