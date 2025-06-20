package 프로그래머스.Level2.폰켄몬;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    count++;
                }
            }
            answer = count / 2;
        }
        return answer;
    }
}
