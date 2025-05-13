package ch08.lecture.p04api;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class App02 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        Object a = s;
        Closeable b = s;
        AutoCloseable c = s;
        Iterator d = s;

        System.out.println(d instanceof Scanner);
        System.out.println(d instanceof Object);
        System.out.println(d instanceof Closeable);
        System.out.println(d instanceof AutoCloseable);
        System.out.println(d instanceof Iterator<?>);
//        d.close();
        //오브젝트
        //클로저블
        //오토클로저블
        //이터레이터

        //인스턴스오브

    }
}
