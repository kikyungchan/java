package 프로그래머스.코딩기초문제.문자열안에문자열안에김기열;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;

        boolean s1 = str1.contains(str2);
        if (s1) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
