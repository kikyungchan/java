package 프로그래머스.Level0.제곱수판별하기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        //전체탐색반복
        for (int i = 0; i <= n; i++) {
            if (i * i == n) {
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }
        //제곱수면(n*n)
        return answer;
    }
}
