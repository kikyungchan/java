package 자습.프로그래머스.코딩기초문제.가위바위보;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);
            if (c == '0') {
                answer += '5';
            } else if (c == '2') {
                answer += '0';
            } else if (c == '5') {
                answer += '2';
            }
        }
        return answer;
    }
}
