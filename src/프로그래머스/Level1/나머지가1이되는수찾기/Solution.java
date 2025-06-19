package 프로그래머스.Level1.나머지가1이되는수찾기;

class Solution {
    public int solution(int n) {
        int answer = 1;
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
