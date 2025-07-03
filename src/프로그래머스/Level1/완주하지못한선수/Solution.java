package 프로그래머스.Level1.완주하지못한선수;

import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < completion.length; j++) {

                if (participant[i] != completion[j]) {
                    answer = participant[i];
                }
            }
        }
        return answer;
    }
}
