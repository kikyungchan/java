package ch08.lecture.p03cast;

public class App01 {
    public static void main(String[] args) {
        MyInterface01 o = new MyClass01();
        o.action();

//        casting : 강제 형변환
//        MyClass01 a = (MyClass01) = o;
    }
}


interface MyInterface01 {
    void action();
}

class MyClass01 implements MyInterface01 {
    @Override
    public void action() {
        System.out.println("MyClass01.action");
    }

    public void method() {
    }
}