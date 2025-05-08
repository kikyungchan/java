package jasup;

import java.util.Scanner;

public class C2025043002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int money = 0;
        int purchase = 0;

        while (run) {
            System.out.println("--------------------------");
            System.out.println("1.용돈 추가 | 2.지출 | 3.종료");
            System.out.println("--------------------------");
            System.out.print("선택> ");
            String str = scanner.nextLine();

            if (str.equals("1")) {
                System.out.print("금액 입력> ");
                int 용돈 = Integer.parseInt(scanner.nextLine());
                money += 용돈;
                System.out.println("잔액> " + money);

            } else if (str.equals("2")) {
                System.out.print("지출 금액 입력> ");
                int 용돈 = Integer.parseInt(scanner.nextLine());
                if (용돈 > money) {
                    System.out.println("잔액 부족");
                } else if (용돈 <= money) {
                    System.out.print("지출 항목> ");
                    String input = scanner.nextLine();
                    money -= 용돈;
                    purchase += 용돈;
                    System.out.println("잔액> " + money);
                }
            } else if (str.equals("3")) {
                run = false;
                System.out.println("종료.");
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
