package 프로그래머스.Level0.머쓱이보다키큰사람;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        //배열전체탐색하고
        for (int i = 0; i < array.length; i++) {
            //머쓱이키보다키크면
            if (array[i] > height) {
                //카운트++
                answer++;
            }
        }
        //그거리턴.
        //끝?
        return answer;
    }
}
