package 프로그래머스.코딩기초문제.구로나눈나머지;

class Solution {
    public int solution(String number) {
        int sum = 0;
        for (char digit : number.toCharArray()) {
            sum += digit - '0';  // 문자 '0'을 빼서 정수로 변환
        }
        return sum % 9;
    }
}
