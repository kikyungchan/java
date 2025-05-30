package leetcode.p119;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {

            for (int j = i - 1; j >= 1; j--) {
                row.set(j, row.get(j - 1) + row.get(j));
            }
            row.add(1);
        }

        return row;
    }
}
