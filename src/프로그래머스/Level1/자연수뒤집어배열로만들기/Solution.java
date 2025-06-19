package 프로그래머스.Level1.자연수뒤집어배열로만들기;

class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        int idx = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            answer[idx] = c - '0';
            idx++;
        }
        return answer;
    }
}
