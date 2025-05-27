package ch19.lecture;

import java.io.*;
import java.net.Socket;

public class App05Client {
    public static void main(String[] args) throws IOException {
        // server에게 file보내기
        // 192.168.0.5 : 9876
        String fileName = "images/123.jpg";

        Socket socket = new Socket("192.168.0.5", 9876);
        try (socket) {

            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);

            OutputStream os = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);

            try (fis; bis; os; bos) {
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }
        }
    }
}
