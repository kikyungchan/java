package ch04.Exercise;

import ch06.exercise.p20.Account;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accountsArrays = new Account[100];
        int accountCount = 0;
        int money = 0; //금액
        boolean run = true;

        while (run) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.종료");
            System.out.println("------------------------------");
            System.out.print("선택>");

            String choice = scanner.nextLine();
            //1.예금
            if (choice.equals("1")) {
                System.out.print("예금액> ");
                String input = scanner.nextLine();
                money += Integer.parseInt(input);
                System.out.println("잔고 = " + money);
                // 2.출금
            } else if (choice.equals("2")) {
                System.out.print("출금액> ");
                String input = scanner.nextLine();
                if (Integer.parseInt(input) > money) {
                    System.out.println("잔고가 부족합니다.");
                } else {
                    money -= Integer.parseInt(input);
                }
                System.out.println("잔고 = " + money);
                //3.종료
            } else if (choice.equals("3")) {
                run = false;
                System.out.println("프로그램 종료.");
            } else {
                System.out.println("잘못 입력 하셨습니다.");
            }
        }
    }
}



