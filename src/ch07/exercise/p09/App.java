package ch07.exercise.p09;

public class App {
    public static void main(String[] args) {
//        B b = new B();
        B b = (B) new A();
//        B b = new D();
    }
}

class A {

}

class B extends A {

}

class C extends A {

}

class D extends B {
}

class E extends B {
}

class F extends C {
}

