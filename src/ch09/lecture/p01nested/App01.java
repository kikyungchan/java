package ch09.lecture.p01nested;

public class App01 {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        MyClass01.SubClass01 b = a.new SubClass01();//거의 볼 수 없는 코드
    }
}


class MyClass01 {
    //클래스
    class SubClass01 {

    }

    //필드
    SubClass01 a = new SubClass01();

    //셍성자
    MyClass01() {
        a = new SubClass01();
    }

    //메소드
}

interface MyInterface01 {

}
