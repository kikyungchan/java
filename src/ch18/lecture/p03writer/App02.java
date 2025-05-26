package ch18.lecture.p03writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class App02 {
    public static void main(String[] args) throws IOException {
        //inputstream, outputstream으로 바이트단위
        //문자(ascii코드 외 )를 읽고 쓰는게 너~~무 불편하다

        //문자(character) 단위
        // 리더 라이터 가 추가됨
        String fileName = "C:/Temp/writer02.txt";
        try (Writer writer = new FileWriter(fileName)) {
            writer.write('a');
            writer.write(97);
            writer.write('걸');
            writer.write(44152);
            writer.flush();
        }

        System.out.println("파일 쓰기 완료");

    }
}
