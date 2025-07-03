package 프로그래머스.Level0.홀수대짝수;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int evensum = 0;
        int oddsum = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[num_list.length % 2] == 0) {
                evensum += num_list[i];
            } else {
                oddsum += num_list[i];
            }

        }
        if (evensum > oddsum) {
            answer = evensum;
        } else {
            answer = oddsum;
        }
        return answer;
    }
}
