package ch06.lecture.p06static;

public class App01 {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        a.name = "donald";
        a.age = 99;

        MyClass01 b = new MyClass01();
        b.name = "musk";
        b.age = 55;

        a.work();
        b.work();
        //인스턴스 멤버는 클래스 이름으로 접근할 수 없음
//       MyClass01.name="abc";

        //클래스 멤버(필드,메소드)는 클래스 이름으로 접근할 수 있음
        MyClass01.address = "new york city";
    }
}

class MyClass01 {
    // 멤버(필드+메소드,(생성자))

    //(멤버)(인스턴스)필드
    String name;
    int age;

    //클래스필드,static(정적) 필드
    static String address;


    //(멤버)(인스턴스)메소드
    void work() {
        System.out.println(this.age + "세의 " + this.name + "가 일한다.");
    }

    //클래스 메소드,static(정적) 메소드
    static void print() {
        System.out.println(address + "에 삽니다.");
    }
    //생성자
}
