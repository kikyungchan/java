package ch07.sec05.exam02;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }
//파이날 메소드라서 오버라이딩할 수 없음.
//    @Override
//    public void stop() {
//        System.out.println("스포츠 카를 멈춤");
//        speed = 0;
//    }
}
