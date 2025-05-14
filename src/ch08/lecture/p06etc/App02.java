package ch08.lecture.p06etc;

public class App02 {
}

interface MyInterface02 {
    void action();

    //몸통이 있는 인스턴스 메쏘드(얘는 추상메쏘드가아님)
    default void method() {
        System.out.println("MyInterface02.method");
    }

    //default메쏘드는 public이다.
    default void hello() {
    }
}

class MyClass021 implements MyInterface02 {
    @Override
    public void action() {
        System.out.println("MyClass021.action");
    }
    //필요하면 default 메쏘드 재정의 가능
}

class MyClass022 implements MyInterface02 {
    @Override
    public void action() {
        System.out.println("MyClass022.action");
    }
}
