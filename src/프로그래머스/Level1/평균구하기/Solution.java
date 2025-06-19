package 프로그래머스.Level1.평균구하기;

class Solution {
    public double solution(int[] arr) {
        double v = 0;
        for (int i = 0; i < arr.length; i++) {
            v += arr[i];
        }
        double answer = v / arr.length;
        return answer;
    }
}
