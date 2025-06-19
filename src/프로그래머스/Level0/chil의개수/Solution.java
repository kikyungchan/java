package 프로그래머스.Level0.chil의개수;

class Solution {
    public int solution(int[] array) {
        int count = 0;
        for (int num : array) {
            String str = String.valueOf(num);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '7') {
                    count++;
                }
            }
        }
        return count;
    }
}
