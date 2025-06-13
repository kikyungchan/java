package 자습.프로그래머스.코딩기초문제.중복된문자제거;

import static java.util.Arrays.stream;

class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (answer.indexOf(c) == -1) {
                answer += c;
            }
        }
        return answer;
    }
}
