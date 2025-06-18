package 프로그래머스.코딩기초문제.개미군단사냥;

class Solution {
    public int solution(int hp) {
        int answer = 0;
        int j = hp / 5; //장군개미 마리수
        int nam = hp % 5; // 장군개미가 사냥하고 남은체력
        int b = nam / 3; // 남은체력을 상대할 병정개미 마릿수
        int nam1 = nam % 3; // 병졍개미가 사냥하고 남은 체력
        answer = j + b + nam1;

        return answer;
    }
}
