package 자습.프로그래머스.코딩기초문제.문자열정렬하기2;

import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String lowerCase = my_string.toLowerCase();
        char[] chars = my_string.toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }
}
