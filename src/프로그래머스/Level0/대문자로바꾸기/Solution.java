package 프로그래머스.Level0.대문자로바꾸기;

class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            char upperCase = Character.toUpperCase(c);
            answer += upperCase;
        }
        return answer;
    }
}
