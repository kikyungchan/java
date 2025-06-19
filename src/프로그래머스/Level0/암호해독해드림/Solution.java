package 프로그래머스.Level0.암호해독해드림;

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";

        for (int i = code - 1; i < cipher.length(); i += code) {
            char c = cipher.charAt(i);
            answer += c;
        }
        return answer;
    }
}