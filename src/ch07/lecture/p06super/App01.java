package ch07.lecture.p06super;

public class App01 {
}

class Parent01 {
    public void action1() {

    }

    public void action2() {
        System.out.println("부모의 액션2");
    }

    public void action3() {
        System.out.println("부모의 액션3");
    }
}

class Child011 extends Parent01 {
    @Override
    public void action3() {
        super.action3();
        // 추가할 일..
        System.out.println("추가된 코드");
        super.action3();
        System.out.println("추가된 코드");
    }

    @Override
    public void action2() {
        System.out.println("재정의한 액견2");

    }

    public void method1() {
        this.method2();
        method2();
        this.action1();
        action1();
        //재정의한 action 으로 실행됨
        this.action2();
        action2();

        //부모의(메소드) action
        super.action2();

        //super : 부모의 멤버에 접근하기 위한 키워드(필드 메소드 등)
    }

    public void method2() {

    }
}
