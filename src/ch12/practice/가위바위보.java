package ch12.practice;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] Comchoice = {"가위", "바위", "보"};
        String userInput;
        System.out.println("가위바위보 게임을 시작합니다");
        System.out.println("가위,바위,보 중에 하나를 선택하세요." + '\n' + "'종료'를 입력하시면 게임이 종료됩니다.");
        while (true) {
            System.out.print("당신의 선택은?");
            userInput = scanner.nextLine();
            if (userInput.equals("종료")) {
                System.out.println("게임을 종료합니다.");
                break;
            } else if ((!userInput.equals("가위") && !userInput.equals("바위") && !userInput.equals("보"))) {
                System.out.println("잘못 입력하셨습니다");
                continue;
            }
            int com = random.nextInt(3);
            String ComputerChoice = Comchoice[com];
            System.out.println("컴퓨터의 선택: " + ComputerChoice);

            if (userInput.equals(ComputerChoice)) {
                System.out.println("무승부 입니다");
            } else if (userInput.equals("가위") && ComputerChoice.equals("보") ||
                    userInput.equals("바위") && ComputerChoice.equals("가위") ||
                    userInput.equals("보") && ComputerChoice.equals("바위")) {
                System.out.println("승리!");
            } else {
                System.out.println("패배.");
            }
        }
        scanner.close();
    }
}
