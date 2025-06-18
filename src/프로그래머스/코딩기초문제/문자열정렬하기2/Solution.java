package 프로그래머스.코딩기초문제.문자열정렬하기2;

import java.util.Arrays;

class Solution {
    public String solution(String my_string) {

        String lowerCase = my_string.toLowerCase();

        char[] a = lowerCase.toCharArray();
        Arrays.sort(a);
        String answer = new String(a);


        return answer;
    }
}
