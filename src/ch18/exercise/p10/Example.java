package ch18.exercise.p10;

import java.io.*;

public class Example {
    public static void main(String[] args) throws FileNotFoundException {
        String origin = "images/eagle.jpg";
        String target = "C:/Temp/eagle.jpg";

        //파일 복사 코드 작성
        InputStream is = new FileInputStream(origin);
        BufferedInputStream bis = new BufferedInputStream(is);
        //BufferedInputStream, BufferedOutputStream 활용
        OutputStream os = new FileOutputStream(target);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        try (bis; bos;) {
            byte[] bucket = new byte[1000];
            int length = 0;
            while ((length = bis.read(bucket)) != -1) {
                bos.write(bucket, 0, length);
            }
            bos.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("파일 복사 종료");
    }
}
