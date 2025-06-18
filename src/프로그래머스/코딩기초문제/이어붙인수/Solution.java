package 프로그래머스.코딩기초문제.이어붙인수;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        for (int i = 0; i < num_list.length; i++) {
            int i1 = num_list[i];
            if (i1 % 2 == 1) {
                odd += i1;
            } else {
                even += i1;
            }

        }
        int a = Integer.parseInt(odd);
        int b = Integer.parseInt(even);
        answer = a + b;
        return answer;
    }
}