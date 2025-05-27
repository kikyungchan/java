package ch18.lecture.p06file;

import java.io.File;

public class App01 {
    public static void main(String[] args) {
        // File : file 정보를 담고 있는 객체
        File f1 = new File("C:/Temp/nothing.txt");
        File f2 = new File("C:/Temp/bear.jpg");

        // exists 존재하냐
        boolean r1 = f1.exists();
        System.out.println("r1 = " + r1);
        boolean r2 = f2.exists();
        System.out.println("r2 = " + r2);

        // getName 이름이뭐냐
        String n1 = f2.getName();
        System.out.println("n1 = " + n1);

        // getPath 경로는 어떻게 되냐
        String p1 = f2.getPath();
        System.out.println("p1 = " + p1);

        // length 파일의크기는 얼마나 되냐
        long l1 = f2.length();
        System.out.println("l1 = " + l1);

        // isDirectory 디렉토리냐
        boolean d1 = f2.isDirectory();
        System.out.println("d1 = " + d1);

        // isFile 파일이냐
        boolean i1 = f2.isFile();
        System.out.println("i1 = " + i1);

    }
}
