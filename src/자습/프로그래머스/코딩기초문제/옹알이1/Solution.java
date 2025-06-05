package 자습.프로그래머스.코딩기초문제.옹알이1;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            if (babbling[i].equals("aya")) {
                answer++;
            } else if (babbling[i].equals("ye")) {
                answer++;
            } else if (babbling[i].equals("woo")) {
                answer++;
            } else if (babbling[i].equals("ma")) {
                answer++;
            }
        }
        return answer;
    }
}