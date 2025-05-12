package ch07.lecture.p01inheritance;

import javax.xml.namespace.QName;

public class App01 {
    public static void main(String[] args) {
        SubClass011 a = new SubClass011();
        a.age = 33;
        a.name = "xmfjavm";
        System.out.println("a.age = " + a.age);
        System.out.println("a.name = " + a.name);
        a.action();
        a.greeting();

        SubClass012 b = new SubClass012();
        b.age = 44;
//        b.name;
        b.address = "늉ㅎㄱ";
        System.out.println("b.age = " + b.age);
        System.out.println("b.address = " + b.address);

        b.action();
//        b.greeting;
        b.go();

        MyClass01 c = new MyClass01();
        c.age = 88;
//        c.name;
        System.out.println("c.age = " + c.age);
        c.action();
    }
}

class MyClass01 {
    //부모 클래스 // 페어런트 클래스
    //상위 클래스 // 슈퍼 클래스
    //상속은 대부분 메소드 상속
    //필드는 프라이빗
    public int age;

    public void action() {

    }
}

class SubClass011 extends MyClass01 {
    //자식 클래스 // 차일드 클래스
    //하위 클래스 // 서브클래스
    // 하나의 자식 클래스가 여러 부모 클래스를 둘 수 없음
    // 하나의 부모 클래스가 여러 자식 클래스를 둘 수 있음
    // 멤버 ㅊ가
    public String name;

    //필드 추가 가능
    public void greeting() {
    }
}

class SubClass012 extends MyClass01 {

    //자식 클래스에 추가할 멤버
    //field
    public String address;

    //method
    public void go() {
    }
}