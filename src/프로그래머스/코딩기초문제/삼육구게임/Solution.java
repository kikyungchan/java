package 프로그래머스.코딩기초문제.삼육구게임;

class Solution {
    public int solution(int order) {
        int answer = 0;
        String a = String.valueOf(order);
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if ((c - '0') % 3 == 0 && (c - '0') != 0) {

                answer++;
            }
        }
        return answer;
    }
}
