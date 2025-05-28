package 자습.프로그래머스.코딩기초문제.세균증식;

class Solution {
    public int solution(int n, int t) {
        int answer = 1;
        for (int i = 0; i < t; i++) {

            answer *= n;
        }
        return answer;
    }
}
