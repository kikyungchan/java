package 프로그래머스.Level0.문자열앞의n개글자;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            char c = my_string.charAt(i);
            answer += c;
        }
        return answer;
    }
}