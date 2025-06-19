package 프로그래머스.Level0.flag에따라다른값반환;

class Solution {
    public int solution(int a, int b, boolean flag) {

        if (flag == true) {
            return a + b;
        } else {
            return a - b;
        }


    }
}