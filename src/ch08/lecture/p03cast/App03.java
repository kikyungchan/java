package ch08.lecture.p03cast;

public class App03 {
    public static void main(String[] args) {
        MyInterface03 a = new MyClass031();
        //인스턴스오브 연산자:왼쪽에 참조변수 오른쪽에 타입
        // 참조 변수가 가리키는 인스턴스(객체가) ㅇ른쪽타입이면 트루
        //아니면 폴스
        if (a instanceof MyClass031) {
            System.out.println("실행되니?1");
            MyClass031 b = (MyClass031) a;
        }
        if (a instanceof MyClass032) {
            System.out.println("실행되니??");
            MyClass032 c = (MyClass032) a;
        }
    }
}

interface MyInterface03 {

}

class MyClass031 implements MyInterface03 {

}

class MyClass032 implements MyInterface03 {

}
