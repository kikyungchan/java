package 프로그래머스.Level0.주사위게임2;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        //모두다를때
        if (a != b && a != c && b != c) {
            answer = a + b + c;
            // 모두 같을때
        } else if (a == b && b == c && a == c) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
            // 두개는같고 하나는 다를때
        } else {
            answer = (a + b + c) * (a * a + b * b + c * c);
        }
        return answer;
    }
}
