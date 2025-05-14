package ch09.lecture.p02local;

public class App02 {


    void some() {
        //지역변수(로컬베리어블)
        //이펙티블리 파이널
        int a = 5;
//            a = 6;
        class MyClass {
            void action() {
                //감싸고있는 메쏘드(썸이에요)
                // 지역변수(a)를 사용한다면
                //  그 지역변수(a)는 값이 변경 되면 안됨.
                System.out.println(a);

            }
        }
    }
}

