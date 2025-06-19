package 프로그래머스.Level0.n개간격의원소들;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int idx = 0;
        int[] answer = new int[(num_list.length + n - 1) / n];
        for (int i = 0; i < num_list.length; i += n) {
            answer[idx] = num_list[i];
            idx++;

        }
        return answer;
    }
}
