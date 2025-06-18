package 프로그래머스.코딩기초문제.접두사인지확인하기;

class Solution {
    public int solution(String my_string, String is_prefix) {
        String s = "";
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            s += c;
            if (s.equals(is_prefix)) {
                return 1;
            }
        }
        return 0;
    }
}
