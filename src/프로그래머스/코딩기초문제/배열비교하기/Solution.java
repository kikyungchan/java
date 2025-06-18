package 프로그래머스.코딩기초문제.배열비교하기;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1sum = 0;
        int arr2sum = 0;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                arr1sum += arr1[i];
            }
            for (int i = 0; i < arr2.length; i++) {
                arr2sum += arr2[i];
            }
            if (arr1sum > arr2sum) {
                answer = arr1sum;
            } else {
                answer = arr2sum;
            }
        }
        return answer;
    }
}
