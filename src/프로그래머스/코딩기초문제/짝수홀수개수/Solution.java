package 프로그래머스.코딩기초문제.짝수홀수개수;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int odd = 0;
        int even = 0;

        //전체탐색
        for (int i = 0; i < num_list.length; i++) {
            //짝수or홀수면
            if (num_list[i] % 2 == 0) {
                even++;

            } else {
                odd++;
            }
        }
        answer = new int[]{even, odd};
        //새로운배열(answer)에 담기
        return answer;
    }
}