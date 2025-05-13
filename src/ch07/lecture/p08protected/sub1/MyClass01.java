package ch07.lecture.p08protected.sub1;

public class MyClass01 {
    //퍼블릭
    public void method1() {
    }

    //패키지 프라이빗 메소드
    protected void method2() {
    }

    void method3() {
    }

    //프라이빗
    private void method4() {

    }

    public void action() {
        method1();
        method3();
        method4();
    }

}
