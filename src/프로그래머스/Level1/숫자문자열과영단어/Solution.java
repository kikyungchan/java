package 프로그래머스.Level1.숫자문자열과영단어;

class Solution {
    public int solution(String s) {
        int answer = 0;
        while (true) {
            if (s.contains("zero")) {
                s = s.replace("zero", "0");
            } else if (s.contains("one")) {
                s = s.replace("one", "1");
            } else if (s.contains("two")) {
                s = s.replace("two", "2");
            } else if (s.contains("three")) {
                s = s.replace("three", "3");
            } else if (s.contains("four")) {
                s = s.replace("four", "4");
            } else if (s.contains("five")) {
                s = s.replace("five", "5");
            } else if (s.contains("six")) {
                s = s.replace("six", "6");
            } else if (s.contains("seven")) {
                s = s.replace("seven", "7");
            } else if (s.contains("eight")) {
                s = s.replace("eight", "8");
            } else if (s.contains("nine")) {
                s = s.replace("nine", "9");
            } else {
                break;
            }
        }
        return Integer.parseInt(s);
    }
}
