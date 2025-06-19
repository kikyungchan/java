package 프로그래머스.Level0.최빈값구하기;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if (a == array[i]) {
                answer++;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}
