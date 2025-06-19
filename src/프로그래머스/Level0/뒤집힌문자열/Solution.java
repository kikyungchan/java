package 프로그래머스.Level0.뒤집힌문자열;

class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (int i = my_string.length() - 1; i >= 0; i--) {
            char c = my_string.charAt(i);
            answer += c;
        }
        return answer;
    }
}
