package etc.lecture.p01var;

import java.util.ArrayList;
import java.util.List;

public class App01 {
    public static void main(String[] args) {
        int a;
        a = 3;
        int b = 5;
        //변수의 타입이 추론 가능하면 var

        var c = 7;
        var d = 7L;
        var f = "java";
//        var e; //변수의 타입 추론 불가 값 할당안해서 ㅇ

        List<Integer> list = List.of(9, 1, 2);

        var list1 = List.of(9, 1, 2);

        ArrayList<String> list3 = new ArrayList<>();
        var list4 = new ArrayList<String>();


    }
}
