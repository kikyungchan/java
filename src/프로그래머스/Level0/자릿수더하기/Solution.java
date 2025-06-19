package 프로그래머스.Level0.자릿수더하기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        //숫자->문자String.valueof =charAt
        String s = String.valueOf(n);
        //전체탐색
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = Integer.parseInt(String.valueOf(c));

            answer += d;
        }
        //더해서 변수에저장?
        return answer;
    }
}
