package ch18.lecture.p01output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App01 {
    public static void main(String[] args) throws IOException {
        // outputstream : 아웃풋스트림. 프로그램에서 나가는 데이터스트림(출력)
        // byte 단위로 출력

        String fileName = "C:/Temp/output1.data";
        OutputStream os = new FileOutputStream(fileName);


        // int값을 파라미터로 받아도
        // 끝의 8비트만 사용하고 24비트는 무시함
        // byte 표현 범위 -127~128

        os.write(100);// 100
        os.write(200);// 200 -> (-56)
        os.write(300);// 300 -> (44)

        System.out.println("프로그램 종료");
    }
}
