package ch11.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App15 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //throws로 여러 익셉션이 발생한다고 명시할 수 있음
    public static void method1() throws FileNotFoundException, ClassNotFoundException {

        //파일낫파운드익셉션
        FileInputStream fio = new FileInputStream("");
        //클래스낫파운드익셉션
        Class.forName("");
    }
}
