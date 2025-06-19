package 프로그래머스.Level0.부분문자열이어붙여문자열만들기;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];
            String s1 = my_strings[i].substring(s, e + 1);
            sb.append(s1);
        }
        answer = sb.toString();
        return answer;
    }
}