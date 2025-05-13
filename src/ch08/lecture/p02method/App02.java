package ch08.lecture.p02method;

public class App02 {
}


interface MyInterface02 {
    //인터페이스의 모든 메소드는 퍼브릭 앱스트랙트 추상메소드다
    public abstract void action1();

    //생략해도 퍼블릭 앱스트랙트임.
    void action2();

    abstract void action3();

    public void action4();
}

class MyClass021 implements MyInterface02 {
    @Override
    public void action1() {

    }

    @Override
    public void action2() {

    }

    @Override
    public void action3() {

    }

    @Override
    public void action4() {

    }
}
