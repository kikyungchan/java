package 프로그래머스.Level1.자릿수더하기;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            answer += c - '0';
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
