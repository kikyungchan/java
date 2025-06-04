package 자습.프로그래머스.코딩기초문제.배열두배만들기;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;

        }
        return answer;
    }
}
