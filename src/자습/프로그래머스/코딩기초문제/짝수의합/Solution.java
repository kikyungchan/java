package 자습.프로그래머스.코딩기초문제.짝수의합;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        //정수 n이 주어질 때,
        // n이하의 "짝수"를 모두 더한 값을
        // return
        return answer;
    }
}
