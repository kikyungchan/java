package ch06.sec08.exam01;

public class Calculator {
    //리턴 값이 없는 메소드 선언
    void powerOn() {
        System.out.println("잔원을 켭니다");
    }

    // 리턴 값이 없는 ㅔㅁ소드 선언
    void powerOff() {
        System.out.println("전원을 끕니다");
    }

    //호출 시 두 정수 값ㅇ을 전ㅂ달받고,
    //호출한 곳오 결과값 intㄹㄹ 리턴한느 ㅁ ㅔ소든 선언
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    //호출 ㅣㅅ 두 정수 값을 전달받고
    //ㅎㅎ출한 ㅗㅅ으로 결과값double을 리턴하는ㄴ 메소드ㅜ선원
    double divide(int x, int y) {
        double result = (double) x / (double) y;
        return result;
    }
}
