package 자습.프로그래머스.코딩기초문제.원소들의곱과합;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int multy = 1;
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            multy *= num_list[i];
        }
        if (multy < sum * sum) {
            answer = 1;
        }
        return answer;
    }
}
