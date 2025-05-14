package ch08.lecture.p06etc;

public class App04 {
    public static void main(String[] args) {
        MyClass041 a = new MyClass041();
//        a.common();
    }
}

interface MyInterface04 {
    default void action1() {
        System.out.println("MyInterface04.action1");
        common();
    }

    default void action2() {
        System.out.println("MyInterface04.action2");
        common();
    }

    // 프라이빗 메쏘드 추가
    private void common() {
        System.out.println("공통된 매우 긴 코드");

    }
}

class MyClass041 implements MyInterface04 {

}

class MyClass042 implements MyInterface04 {

}
