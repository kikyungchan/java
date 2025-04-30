package ch04.lecture;

import java.util.Scanner;

public class C20250430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // while 문 제어용변수
        boolean run = true;
        // 잔액을 담을 변수
        int balance = 15000;
        System.out.println("잔액> " + balance);

        while (run) {
            System.out.println("------------------");
            System.out.println("1.물건 구매 | 2.종료");
            System.out.println("------------------");
            System.out.print("선택> ");
            //키보드에서 입력한내용을 입력받음
            String str = scanner.nextLine();
            //1.물건구매
            if (str.equals("1")) {
                //물건 가격 입력>
                System.out.print("물건 가격 입력> ");
                //잔액보다 비싼 물건을 사려고하면
                int money = Integer.parseInt(scanner.nextLine());
                if (money > balance) {
                    //"잔액이 부족합니다."
                    System.out.println("잔액이 부족합니다.");
                } else {
                    balance -= money;
                    System.out.println("잔액> " + balance);
                }
                //가격 입력하면 잔액에서 자동차감
                //2.종료
            } else if (str.equals("2")) {
                run = false;
                System.out.println("종료.");
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
