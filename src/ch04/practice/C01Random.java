package ch04.practice;

public class C01Random {
    public static void main(String[] args) {
        // 두 개의 주사위를 돌려서 같은 값이 나오면 당첨 이라고 출력
//        그렇지 않으면 다시 돌려보세요 출력
        int dice1 = ((int) (Math.random() * 6) + 1);
        int dice2 = ((int) (Math.random() * 6) + 1);
        System.out.println("dice1 = " + dice1);
        System.out.println("dice2 = " + dice2);
        if (dice1 == dice2) {
            System.out.println("당첨");
        } else {
            System.out.println("다시 돌려보세요");
        }
    }
}

