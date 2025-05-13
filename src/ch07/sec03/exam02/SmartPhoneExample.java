package ch07.sec03.exam02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        //스마트폰 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println(myPhone.getModel());
        System.out.println(myPhone.getColor());
    }
}
