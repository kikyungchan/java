package 자습.프로그래머스.코딩기초문제.N의배수고르기123131332132131;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};

        for (int i = 0; i < numlist.length; i++) {
            String b = String.valueOf(numlist[i] * n);
//            answer += b;
        }
        return answer;
    }
}
