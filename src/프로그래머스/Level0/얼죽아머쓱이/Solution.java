package 프로그래머스.Level0.얼죽아머쓱이;

class Solution {
    public int[] solution(int money) {

        int jan = money / 5500;
        int nam = money - (5500 * jan);
        int[] answer = {jan, nam};
        // 아이스 아메리카노는 한잔에 5,500원입니다.
        // 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
        // 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열 return
        return answer;
    }
}