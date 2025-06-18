package 프로그래머스.코딩기초문제.조건에맞게수열변환하기;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        if (k % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] * k;
            }
        }
        if (k % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] + k;
            }
        }
        return answer;
    }
}
