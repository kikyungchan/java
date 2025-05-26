package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) throws IOException {

        try {
            OutputStream os = new FileOutputStream("C:/Temp/test2.db");

            byte[] array = {10, 20, 30}; // 배열 아이템 3개니까 3바이트

            os.write(array);

            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
