package 자습.프로그래머스.코딩기초문제.문자열곱하기;

class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < my_string.length(); j++) {
                char c = my_string.charAt(j);
                answer += c;
            }
        }
        return answer;
    }
}