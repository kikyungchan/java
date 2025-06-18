package 프로그래머스.코딩기초문제.공백으로구분하기2;


class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.trim().split(" +");
        ;


        return answer;
    }
}
