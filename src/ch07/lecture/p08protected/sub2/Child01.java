package ch07.lecture.p08protected.sub2;

import ch07.lecture.p08protected.sub1.MyClass01;

public class Child01 extends MyClass01 {
    public void action2() {
        method1(); // 퍼블릭
        //프로텍티드 : 다른패키지에 있어도 상속 바으면 접근 가능
        method2();
//        method3;//패키지 프라이빗
//        method4;//프라이빗
    }
}
