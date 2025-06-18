package 프로그래머스.코딩기초문제.배열뒤집기;

class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n];
        //전체탐색
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[n - 1 - i];
        }
        return answer;
    }
}
