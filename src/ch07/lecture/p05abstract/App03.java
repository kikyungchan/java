package ch07.lecture.p05abstract;

public class App03 {
}


abstract class Canids03 {
    public abstract void bark();
}

class Chihuahua03 extends Canids03 {
    //추상 메소드는 꼭 재정의 해야함

    @Override
    public void bark() {
        System.out.println("개갱");
    }
}

abstract class Wolf03 extends Canids03 {
    //추상 메소드재정의 안하면 추상클래슬 만들어야함
    //추상 클래스로는 인스턴스 생성 XXXXX
}

