package 프로그래머스.Level0.세균증식;

class Solution {
    public int solution(int n, int t) {
        int answer = 1;
        for (int i = 0; i < t; i++) {

            answer *= n;
        }
        return answer;
    }
}
