package jasup.p20250519;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App02 {
    public List<Integer> sumOfPairsWithTargetSum(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int tar1 = nums[i] + nums[i + 1];
            if (tar1 == 9) {
                result.add(nums[i], nums[i + 1]);

            } else {
                continue;
            }
        }
        // 코드 작성하기

        return result;
    }
}