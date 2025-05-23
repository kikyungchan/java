package ch11.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App16 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        FileInputStream foi = new FileInputStream("");
        Class.forName("");
    }

    public void method2() throws NumberFormatException, ClassNotFoundException {
        try {
            method2();
        } catch (Exception e) {

        }

    }

    void method3() throws Exception {
        method2();
    }

}
