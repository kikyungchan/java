package 프로그래머스.코딩기초문제.최댓값만들기;

class Solution {
    public int solution(int[] numbers) {

        int max = numbers[0];
        //전체탐색
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                //2개를 뽑아서 곱해야겠고.
                int gop = numbers[i] * numbers[j];
                //비교해야겠고.
                if (max < gop) {
                    max = gop;
                }
            }
        }
        return max;
    }
}
