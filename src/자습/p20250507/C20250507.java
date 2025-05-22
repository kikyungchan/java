package 자습.p20250507;

import java.util.Arrays;

public class C20250507 {
    public static void main(String[] args) {
        //배열 분할
        //nums정수 배열이 주어지면 , 모든 정수 의 합이 최대가 되도록 정수 들을2n 쌍으로 묶습니다
        // n. 최대화 된 합을 반환합니다 .(a1, b1), (a2, b2), ..., (an, bn)min(ai, bi)i
        int[] nums = {1, 4, 3, 2};
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        System.out.println("sum = " + sum);
    }
}
