package 프로그래머스.Level0.캐릭터의좌표;

class Solution {
    private int number;

    @Override
    public String toString() {
        return "Solution{" +
                "number=" + number +
                '}';
    }

    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left") && answer[0] > -maxX) {
                answer[0] = answer[0] - 1;
            } else if (keyinput[i].equals("right") && answer[0] < maxX) {
                answer[0] = answer[0] + 1;
            } else if (keyinput[i].equals("down") && answer[1] > -maxY) {
                answer[1] = answer[1] - 1;
            } else if (keyinput[i].equals("up") && answer[1] < maxY) {
                answer[1] = answer[1] + 1;
            }
        }
        return answer;
    }
}
