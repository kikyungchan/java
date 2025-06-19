package 프로그래머스.Level0.대문자와소문자;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isLowerCase(c)) {
                char upperCase = Character.toUpperCase(c);
                answer += upperCase;
            } else {
                char lowerCase = Character.toLowerCase(c);
                answer += lowerCase;
            }
        }
        return answer;
    }
}
