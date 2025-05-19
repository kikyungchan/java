package leetcode.p118;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prev;
        List<Integer> current = new ArrayList<>();
        current.add(1);

        for (int currentIndex = 0; currentIndex < numRows; currentIndex++) {
            prev = current;
            current = new ArrayList<>();
            current.add(1);
            for (int i = 0; i < prev.size() - 2; i++) {
                current.add(prev.get(i) + prev.get(i + 1));
            }
            current.add(1);
        }
        return result;
    }
}