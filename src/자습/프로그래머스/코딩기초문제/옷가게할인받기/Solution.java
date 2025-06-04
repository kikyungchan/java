package 자습.프로그래머스.코딩기초문제.옷가게할인받기;

class Solution {
    public int solution(int price) {
        int answer = 0;
        if (price >= 500000) {
            double v = (double) price * 0.2;
            answer = (int) (price - v);
        } else if (price >= 300000) {
            double v = (double) price * 0.1;
            answer = (int) (price - v);
        } else if (price >= 100000) {
            double v = (double) price * 0.05;
            answer = (int) (price - v);
        } else {
            answer = price;
        }
        return answer;
    }
}

