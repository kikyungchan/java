package 프로그래머스.코딩기초문제.배열회전시키기;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (direction.equals("right")) {
            for (int i = 0; i < numbers.length; i++) {
                numbers[numbers.length - 1] = answer[0];
                answer[i] = numbers[i + 1];
            }
        } else {
            for (int i = 1; i < numbers.length; i++) {
                answer[0] = numbers[numbers.length - 1];
                answer[i] = numbers[i - 1];
            }

        }
        return answer;
    }
}

