package 프로그래머스.Level0.뒤에서5등위로;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};

        return Arrays.stream(num_list).sorted().skip(5).toArray();
    }
}
