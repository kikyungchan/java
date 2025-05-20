package leetcode.p118;

import java.util.List;

public class test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int numRows = 10;
        List<List<Integer>> triangle = sol.generate(numRows);

        System.out.println("Pascal's Triangle with " + numRows + " rows:");
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}