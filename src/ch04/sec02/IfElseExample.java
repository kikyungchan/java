package ch04.sec02;

public class IfElseExample {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("점수가 90보다 큼");
            System.out.println("등급은 A");
        } else {
            System.out.println("점수가 90보다 작음");
            System.out.println("등급은 B");
        }
    }
}
