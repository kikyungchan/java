package 프로그래머스.코딩기초문제.주사위의개수;

class Solution {
    public int solution(int[] box, int n) {

        //b[0] 상자의 가로길이
        //b[1] 상자의 세로
        //b[2] 상자의 높이
        int 가로 = box[0] / n;
        int 세로 = box[1] / n;
        int 높이 = box[2] / n;
        int 주사위개수 = 가로 * 세로 * 높이;

        return 주사위개수;
    }
}
