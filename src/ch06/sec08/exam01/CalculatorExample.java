package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        //cal객체 생성
        Calculator C = new Calculator();

        //리턴 값이 없는 powerOn() 메소드 호출
        C.powerOn();

        //plus 메소드 호출 시 5와 6을 매개값으로 제공하고,
        //덧셈 결과를 리턴받아 result1 변수에 대입
        int result1 = C.plus(5, 6);
        System.out.println("result1 = " + result1);
        int x = 10;
        int y = 4;
        //divede 메소드 홏ㄹ 시 변수xㅘyㅡ이 ㄱ밧을 매개값으로 제공하고
        //나눗셈 결과르 리렅ㄴ받아 result2 변수에 대입
        double result2 = C.divide(x, y);
        System.out.println("result2 = " + result2);

        //리턴값이 없는 powerOff ㅁㅔ소드 호출
        C.powerOff();
    }
}
