package 프로그래머스.Level0.모음제거;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        //전체탐색하면서
        //문자열 = 문자로
        //조건확인
        //해당값리턴
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                answer += c;
            }
        }
        return answer;
    }
}
