package 프로그래머스.Level1.핸드폰번호가리기;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length(); i++) {
            int garyo = phone_number.length() - 4;
            String repeat = "*".repeat(garyo);
            String duit = phone_number.substring(phone_number.length() - 4);
            answer = repeat + duit;
        }

        return answer;
    }
}
