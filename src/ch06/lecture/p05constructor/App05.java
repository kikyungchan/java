package ch06.lecture.p05constructor;

public class App05 {
}

class MyClass05 {
    String name;
    String email;
    int age;
    boolean done;

    //생성자는 여러 개 만들 수 있습니다
    //여러 생성자는 파라미터 갯수, 타입, 순서가 달라야 합니다

    public MyClass05(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public MyClass05(int age, boolean done) {
        this.age = age;
        this.done = done;
    }

    public MyClass05(String name) {
        this.name = name;
    }

//    public MyClass05(String name) {
//        this.email
//    }

    public MyClass05(String name, String email, int age, boolean done) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.done = done;
    }
}
