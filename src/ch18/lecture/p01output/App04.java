package ch18.lecture.p01output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App04 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String fileName = "C:/Temp/output4.data";

        OutputStream os = new FileOutputStream(fileName);
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "번째 쓰는 중...");
            os.write(1);
            Thread.sleep(2000);
        }
        System.out.println("출력 완료");

        //사용한 stream (자원,resource)를 닫음
        //파일을 연곳에서 닫아줘야함(close)
        os.close();
    }
}
