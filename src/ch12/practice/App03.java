package ch12.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App03 {
    public static void main(String[] args) {
        //사용자 입력 받아서
        Scanner scanner = new Scanner(System.in);
        System.out.println("전화번호를 입력해주세요.\n'종료'를 입력하시면 프로그램이 종료 됩니다");
        String userInput;

        //유효한 전화번호 인지 확인
        //010999988888
        //010-9999-8888
        //010 9999 8888
        //010-99998888
        //010 99998888
        while (true) {
            System.out.print("입력>");
            userInput = scanner.nextLine();
            //아래 전화번호들은 패턴에 일치하는 것들인지?
            if (Pattern.matches("010[\\s-]?\\d{4}[\\s-]?\\d{4}", userInput)) {
                //일치하다
                System.out.println("유효한 전화번호 입니다");

            } else if (userInput.equals("종료")) {
                //종료하다
                System.out.println("프로그램을 종료합니다");
                break;

            } else {
                //일치하지않다
                System.out.println("유효하지 않은 전화번호 입니다");
            }
            System.out.println();
        }
    }
}
