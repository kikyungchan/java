package 프로그래머스.Level0.특정문자제거하기;

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        //전체탐색
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c != letter.charAt(0)) {
                answer += c;
            }
        }
        //대소문자 통일
        //letter포함하고있는지
        //포함하고있으면 삭제

        return answer;
    }
}
