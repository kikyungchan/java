package 프로그래머스.Level0.ad제거하기;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        String[] answer = new String[list.size()];

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                list.add(strArr[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}
