package ch07.lecture.p05abstract;

public class App02 {
    public static void main(String[] args) {
        Canids02 a = new Chihuahua02();
        a.bark();

        Canids02 b = new Wolf02();
        b.bark();

    }
}

// 개과
//추상메소드가 있으면 무조건 추상클래스가 이어야함
abstract class Canids02 {
    //앱스트랙트 메소드 추상메소드 : 몸통메소드
    public abstract void bark();
}

class Chihuahua02 extends Canids02 {
    @Override
    public void bark() {
        System.out.println("깨갱");

    }
}

class Wolf02 extends Canids02 {
    @Override
    public void bark() {
        System.out.println("아우~~~~");
    }
}
