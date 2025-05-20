package leetcode.p1684;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        //allowed에 있는 각 문자(캐릭터)를 저장한 Set만들기
        Set<Character> set = new HashSet<>();

        //allowed 각 문자를 탐색해서
        for (char s : allowed.toCharArray()) {
            //Set에 넣고(add)
            set.add(s);
        }
        int count = 0;
        //words에 있는 각 문자열을 전체 탐색해서 각 문자열의 문자가 allowed에 있는 지 확인
        //1.words의 각 문자열 탐색
        for (String word : words) {
            boolean a = true;
            //2.Set에 있는지 확인(contains)
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    a = false;
                    break;

                }
            }
            //3.모두 다 있으면 count 늘리기
            if (a) {
                count++;
            }
        }
        return count;


    }
}