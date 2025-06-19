package 프로그래머스.Level0.원하는문자열찾기;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        return (myString.toUpperCase().contains(pat.toUpperCase()) ? 1 : 0);
    }
}
