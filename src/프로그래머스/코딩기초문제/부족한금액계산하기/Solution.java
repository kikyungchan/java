package 프로그래머스.코딩기초문제.부족한금액계산하기;

class Solution {
    public long solution(int price, int money, int count) {

        long yogum = 0;
        for (int i = 1; i <= count; i++) {
            yogum += (long) i * price;
        }
        if (yogum < money) {
            return 0;
        } else {
            return yogum - money;
        }
    }
}