package 프로그래머스.코딩기초문제.문자반복출력하기;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        //전체탐색
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            //대소문자통일
            c = Character.toLowerCase(c);
            for (int j = 0; j < n; j++) {
                answer += c;
            }

        }
        //각문자(char?)를 n번반복한문자열(String)을출력
        return answer;
    }
}
