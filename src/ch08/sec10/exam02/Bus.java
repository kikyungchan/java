package ch08.sec10.exam02;

public class Bus implements Vehicle {
    //추상 메소드재정의

    @Override
    public void run() {
        System.out.println("버스달릴게");
    }

    //추가 메소드
    public void checkFare() {
        System.out.println("체크할게");
    }
}
