package 프로그래머스.Level0.n번째원소부터;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - (n - 1)];
        for (int i = n - 1; i < num_list.length; i++) {
            answer[i - (n - 1)] = num_list[i];
        }
        return answer;
    }
}