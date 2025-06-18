package 프로그래머스.코딩기초문제.조건에맞게수열변환하기1;

class Solution {
    public int[] solution(int[] arr) {


        // 정수 배열 arr가 주어집니다.
        // arr의 각 원소에 대해 값이 50보다 크거나 같은
        // 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.

        // 배열전체탐색
        for (int i = 0; i < arr.length; i++) {
            // 각 원소가 50보다 크거나 같으면
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                //짝수라면 2로 나누고,
                arr[i] = arr[i] / 2;
                // 50보다 작은 홀수라면 2를 곱합니다.
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }
}
