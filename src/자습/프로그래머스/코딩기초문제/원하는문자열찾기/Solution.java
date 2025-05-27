package 자습.프로그래머스.코딩기초문제.원하는문자열찾기;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        return (myString.toUpperCase().contains(pat.toUpperCase()) ? 1 : 0);
    }
}
