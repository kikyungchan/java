package ch11.sec02.exam01;

import static ch11.sec02.exam01.ExceptionHandlingExample1.printLength;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }

    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("result = " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("[무조건 실행]\n");
        }
    }
}
