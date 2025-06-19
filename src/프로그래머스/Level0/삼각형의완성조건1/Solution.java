package 프로그래머스.Level0.삼각형의완성조건1;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        //가장긴변 가정
        int longside = sides[0];
        //두변의 합
        int sum = 0;
        //배열전체탐색
        for (int i = 0; i < sides.length; i++) {
            if (sides[i] > longside) {
                //가장 긴변 갱신
                longside = sides[i];
            }
            //세변의 합 갱신
            sum += sides[i];
        }
        //세변의 합에서 가장긴변 뺴면 = 나머지 두변의 합
        sum -= longside;

        //두변의 합이 > 가장긴변 이면
        if (sum > longside) {
            answer = 1;
            //삼각형 만들 수 없음
        } else {
            answer = 2;
        }


        return answer;
    }
}



