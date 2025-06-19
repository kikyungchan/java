package 프로그래머스.Level0.배열원소의길이;

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        //원소의 길이를 담은 배열?
        //size? length?
        //전체탐색 2번??
        for (int i = 0; i < strlist.length; i++) {
            String s = strlist[i];
            answer[i] = s.length();
        }
        return answer;
    }
}

