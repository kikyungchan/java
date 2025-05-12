package ch07.lecture.p02override;

public class App01 {
    public static void main(String[] args) {
        SubClass011 a = new SubClass011();
        a.action();
        a.hello();

        SubClass012 b = new SubClass012();
        b.action();
    }
}

class SuperClass01 {
    public void action() {
        System.out.println("SuperClass01.action");
    }
}

class SubClass012 extends SuperClass01 {
    //추가 매소드


    @Override
    public void action() {
        System.out.println("SubClass012.action");
    }
}

class SubClass011 extends SuperClass01 {

    //상속받은 메소드를 다시 정의할 수 있음
    //@Override 애노테이션 : 오버라이드메소드를 잘 작성햇는 지 검증/.
    @Override
    public void action() {
        System.out.println("SuperClass11.action");
    }

    public void hello() {
        System.out.println("SubClass011.hello");
    }

}
