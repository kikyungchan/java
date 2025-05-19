package leetcode.p1046;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int s : stones) {
            list.add(s);
        }

        while (list.size() > 1) {

            for (int i = 0; i < list.size(); i++) {
                //1. 돌을(리스트)를 정렬
                Collections.sort(list);
                //2. 마지막 index의 요소와 마지막-1 인덱스의 요소를 꺼내고(지우고)
                int x = list.remove(list.size() - 1);
                
                int y = list.remove(list.size() - 1);
                //3. 차이를 구해서 list에 다시 넣고(이때 차이가 0이면 넣지 않음)


                if ((x != y)) {

                    list.add(x - y);
                }
            }
            //4. 1번부터 다시 시작
            // 하나만 남을 때 까지 반복해서, 하나남은 값을 리
        }
        return
                list.isEmpty() ? 0 : list.get(0);
    }
}
