package ch06.lecture.p05constructor;

public class App04 {
}

class MyClass41 {
    String name;
    String address;
    int age;
    boolean married;

    //alt+insert 컨스트럭터 제너레이터
    public MyClass41(String name, String address, int age, boolean married) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.married = married;
    }
}

class MyClass42 {
    int age;
    int number;
    int ssn;
    int years;
    int what;

    public MyClass42(int age, int number, int ssn, int years, int what) {
        this.age = age;
        this.number = number;
        this.ssn = ssn;
        this.years = years;
        this.what = what;
    }
}
