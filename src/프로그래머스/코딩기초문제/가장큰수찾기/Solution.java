package 프로그래머스.코딩기초문제.가장큰수찾기;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if (max < a) {
                max = a;
                answer[0] = max;
                answer[1] = i;
            }
        }
        return answer;
    }
}