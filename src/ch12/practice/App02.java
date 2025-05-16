package ch12.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App02 {
    public static void main(String[] args) {
        //사용자로 부터 입력받아서
        Scanner scanner = new Scanner(System.in);
        System.out.println("3글자 이상 입력해주세요.");
        String userInput;


        while (true) {
            System.out.println();
            System.out.print("입력>");
            userInput = scanner.nextLine();
            //한글 3글자 이상인지 확인하는 코드작성
            if (Pattern.matches("[가-힣]{3,}", userInput)) {
                //3글자이상
                System.out.println("3글자 이상입니다.");
            } else {
                //3글자미만
                System.out.println("3글자 미만입니다.");
                continue;
            }

            break;
        }
        scanner.close();
    }
}
