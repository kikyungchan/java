package 프로그래머스.코딩기초문제.최댓값만들기2;

class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int max = numbers[i] * numbers[j];
                if (max > answer) {
                    answer = max;
                }
            }
        }
        return answer;
    }
}
