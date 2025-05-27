package 자습.프로그래머스.코딩기초문제.n보다커질때까지더하기;

class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if (answer > n) {
                break;

            }
        }
        return answer;
    }
}
