package 프로그래머스.Level0.n번째원소까지;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }
}
