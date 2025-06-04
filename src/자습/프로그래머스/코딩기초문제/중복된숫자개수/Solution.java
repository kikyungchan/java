package 자습.프로그래머스.코딩기초문제.중복된숫자개수;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        //전체탐색해서
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                answer++;
            }
        }
        //n이 잇으면 포함하면 같으면
        //answer++
        return answer;
    }
}
