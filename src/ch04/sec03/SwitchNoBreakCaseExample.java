package ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 4) + 8;
        System.out.println("[현재시간 :" + time + "시]");

        switch (time) {
            case 8:
                System.out.println("출근합니다");
            case 9:
                System.out.println("회의합니다");
            case 10:
                System.out.println("업무합니다");
            default:
                System.out.println("외근합니다");

        }
    }
}
