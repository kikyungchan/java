package 프로그래머스.Level0.짝수는싫어요;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2];

        int index = 0;
        for (int i = 1; i <= n; i += 2) {
            answer[index] = i;
            index++;

        }
        return answer;
    }
}