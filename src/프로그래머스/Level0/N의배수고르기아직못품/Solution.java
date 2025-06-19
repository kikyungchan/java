package 프로그래머스.Level0.N의배수고르기아직못품;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer = new int[]{numlist[i]};
            }
        }
        return answer;
    }
}
