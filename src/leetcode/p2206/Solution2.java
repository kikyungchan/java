package leetcode.p2206;

import java.util.Arrays;
import java.util.Map;

import static java.util.function.Function.*;
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.groupingBy;

public class Solution2 {
    public boolean divideArray(int[] nums) {
        //Stream 사용
        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(identity(), counting()));

        return map.values()
                .stream()
                .allMatch(e -> e % 2 == 0);
    }
}
