package ch06.exercise.p20;

import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        Account[] accountsArrays = new Account[100];
        int accountCount = 0;
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("--------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목로 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("--------------------------------------------");
            System.out.print("선택>");
            String choice = scanner.nextLine();

            //1. 계좌
            // 생성
            switch (choice) {
                case "1" -> {
                    System.out.println("---------");
                    System.out.println("계좌생성");
                    System.out.println("---------");
                    System.out.print("계좌번호: ");
                    String ano = scanner.nextLine();
                    System.out.print("계좌주: ");
                    String name = scanner.nextLine();
                    System.out.print("초기입금액: ");
                    int balance = Integer.parseInt(scanner.nextLine());
                    // 계좌 생성 후 배열에 저장
                    accountsArrays[accountCount++] = new Account(name, ano, balance);
                    System.out.println("결과: 계좌가 생성되었습니다.");
                    //2 계좌목록
                }
                case "2" -> {
                    System.out.println("---------");
                    System.out.println("계좌목록");
                    System.out.println("---------");
                    // 계좌 목록 출력1
                    if (accountCount == 0) {
                        System.out.println("등록된 계좌가 없습니다.");
                    } else {
                        for (int i = 0; i < accountCount; i++) {
                            accountsArrays[i].showInfo();  // 계좌 정보 출력
                        }
                    }
                    //3 예금
                }
                case "3" -> {
                    System.out.println("---------");
                    System.out.println("예금");
                    System.out.println("---------");
                    System.out.print("계좌번호: ");
                    String inputAno = scanner.nextLine();
                    Account target = findAccount(accountsArrays, accountCount, inputAno);

                    if (target != null) {
                        System.out.print("예금액: ");
                        int amount = Integer.parseInt(scanner.nextLine());
                        target.setBalance(target.getBalance() + amount);
                        System.out.println("예금 완료되었습니다.");
                    } else {
                        System.out.println("계좌를 찾을 수 없습니다.");
                    }

                }
                case "4" -> {
                    System.out.println("---------");
                    System.out.println("출금");
                    System.out.println("---------");
                    System.out.print("계좌번호: ");
                    String inputAno = scanner.nextLine();
                    Account target = findAccount(accountsArrays, accountCount, inputAno);

                    if (target != null) {
                        System.out.print("출금액: ");
                        int amount = Integer.parseInt(scanner.nextLine());

                        if (target.getBalance() >= amount) {
                            target.setBalance(target.getBalance() - amount);
                            System.out.println("출금 완료되었습니다.");
                        } else {
                            System.out.println("잔액이 부족합니다.");
                        }
                    } else {
                        System.out.println("계좌를 찾을 수 없습니다.");
                    }
                }
                case "5" -> {
                    run = false;
                    System.out.println("프로그램 종료");
                }
                default -> System.out.println("잘못 입력 하셨습니다.");
            }
        }
        scanner.close();
    }

    public static Account findAccount(Account[] arr, int count, String ano) {
        for (int i = 0; i < count; i++) {
            if (arr[i].getAno().equals(ano)) {
                return arr[i];
            }
        }
        return null;  // 계좌를 찾지 못한 경우
    }
}

