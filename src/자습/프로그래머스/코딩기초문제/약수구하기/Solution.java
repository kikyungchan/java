package 자습.프로그래머스.코딩기초문제.약수구하기;

class Solution {
    public int[] solution(int n) {

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        int[] answer = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}
