package ch05.lecture;

public class C20250502 {
    public static void main(String[] args) {
//        int count = 0;
//        int[][] mat = {
//                {1, 0, 1, 1, 0},
//                {1, 1, 0, 1, 1},
//                {0, 1, 1, 1, 0},
//                {1, 1, 1, 0, 0}
//        };
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//                if (mat[i][j] == 1) {
//                    count += mat[i][j];
//                }
//            }
//        }
//        System.out.println("count = " + count);
//        int[][] m = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 1, 2, 3},
//                {4, 5, 6, 7}
//        };
//        int t = 3;
//        int c = 0;
//
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[i].length; j++) {
//                if (m[i][j] == 3) {
//                    c++;
//                }
//            }
//        }
//        System.out.println("c = " + c);

//        int[] nums = {1, 2, 2, 3, 4, 4, 5};
//        int[] a = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != nums[i - 1]) {
//                a[i] = nums[i];
//            }
//            System.out.println(a[i]);
//        }
        //가장자리만 순회하면서 더하기
        int[][] m = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == 0 || i == m.length - 1 || j == 0 || j == m[i].length - 1) {
                    sum += m[i][j];
                }
            }
        }
        System.out.println("sum = " + sum);
    }
}
