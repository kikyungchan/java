package leetcode.p119;


import java.util.ArrayList;
import java.util.List;

class newnewsol {
    public List<Integer> getRow(int rowIndex) {
        //초기값(초기화)
        List<Integer> prev;
        List<Integer> current = new ArrayList<>();
        current.add(1);
        //첫번째와 마지막은 1로 고정
        //그 사잇값들은
        for (int currentIndex = 0; currentIndex < rowIndex; currentIndex++) {
            prev = current;
            current = new ArrayList<>();
            for (int i = 0; i < prev.size() - 2; i++) {
                current.add(prev.get(i) + prev.get(i + 1));
            }
//        행 .0 + 행 .1
//        행 .1 + 행 .2
//                ...
//        행.i + 행.i +1
            // current.add(prev.get(prev.size()-2) + prev.get(prev.size()-1)
            current.add(1);
        }
        return current;
    }
}
