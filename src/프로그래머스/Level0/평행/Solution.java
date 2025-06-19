package 프로그래머스.Level0.평행;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        int x1 = dots[0][0], y1 = dots[0][1];
        int x2 = dots[1][0], y2 = dots[1][1];
        int x3 = dots[2][0], y3 = dots[2][1];
        int x4 = dots[3][0], y4 = dots[3][1];

        if (
            // 선분 1-2 와 선분 3-4 비교
                (y2 - y1) * (x4 - x3) == (y4 - y3) * (x2 - x1) ||

                        // 선분 1-3 와 선분 2-4 비교
                        (y3 - y1) * (x4 - x2) == (y4 - y2) * (x3 - x1) ||

                        // 선분 1-4 와 선분 2-3 비교
                        (y4 - y1) * (x3 - x2) == (y3 - y2) * (x4 - x1)
        ) {
            answer = 1;
        }

        return answer;
    }
}
