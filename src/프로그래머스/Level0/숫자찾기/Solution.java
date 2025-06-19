package 프로그래머스.Level0.숫자찾기;

class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String s = String.valueOf(num);
        String d = String.valueOf(k);
        for (int i = 0; i < s.length(); i++) {
            if (s.contains(d)) {
                answer = s.indexOf(d) + 1;
            }

        }
        return answer;
    }
}
