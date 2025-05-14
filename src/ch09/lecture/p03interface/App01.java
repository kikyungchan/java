package ch09.lecture.p03interface;

public class App01 {
    public static void main(String[] args) {
        class Some implements MyClass01.MyInterface1 {
            @Override
            public void action() {

            }
        }
    }
}

class MyClass011 implements MyClass01.MyInterface1 {
    @Override
    public void action() {

    }
}

class MyClass01 {
    //클래스
    //인터페이스
    interface MyInterface1 {
        void action();
    }

    //필드
    //생성자
    //메소드
    void method() {
        class SomeClass implements MyInterface1 {
            @Override
            public void action() {
                System.out.println("SomeClass.action");
            }
        }
        SomeClass a = new SomeClass();
        a.action();

    }
}
