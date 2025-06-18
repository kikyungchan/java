package 프로그래머스.코딩기초문제.접미사배열;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for (int i = my_string.length() - 1; i >= 0; i--) {
            char c = my_string.charAt(i);
            String s = my_string.substring(i);
            list.add(s);
        }
        list.sort(null);
        
        return list.toArray(new String[0]);
    }
}
