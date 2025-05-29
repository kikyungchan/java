package 자습.프로그래머스.코딩기초문제.배열자르기;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int idx = 0;
        for (int i = num1; i <= num2; i++) {
            answer[idx] = numbers[i];
            idx++;
        }
        return answer;
    }
}
