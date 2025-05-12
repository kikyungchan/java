package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        //SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        //Phone으로부터 상속받은 필드 읽기
        System.out.println("model = " + myPhone.model);
        System.out.println("color = " + myPhone.color);

        //SmartPhone의 필드 읽기
        System.out.println("myPhone.wifi = " + myPhone.wifi);

        //Phone으로부터 상속받은 메소드 호출
        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("아년ㅇ하세요 저는 홍길동인뎅");
        myPhone.sendVoice("아네");
        myPhone.hangUp();

        //SmartPhone의 메소드 호출
        myPhone.setWifi(true);

        myPhone.internet();
    }
}
