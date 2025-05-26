package ch18.lecture.p05filter;

import java.io.*;

public class App04 {
    public static void main(String[] args) throws IOException {
        long start = 0;
        long end = 0;
        long diff = 0;


        //BufferedOutputStream
        start = System.nanoTime();
        bufferedOutputStream();
        end = System.nanoTime();
        diff = end - start;
        System.out.println("b o s diff = " + diff);


        //BufferedInputStream
        bufferedInputStream();
        end = System.nanoTime();
        diff = end - start;
        System.out.println("bis diff = " + diff);


        //OutputStream
        start = System.nanoTime();
        outputStream();
        end = System.nanoTime();
        diff = end - start;
        System.out.println("os diff = " + diff);


        //InputStream
//        inputStream();
        start = System.nanoTime();
        end = System.nanoTime();
        diff = end - start;
        System.out.println("is diff = " + diff);
    }

    private static void bufferedInputStream() throws IOException {
        String file = "C:/Temp/filter41.data";
        try {
            InputStream is = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(is);

            try (is; bis) {
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = is.read(data)) != -1) {
                    //
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void outputStream() {
        String file = "C:/Temp/filter42.data";
        try {
            OutputStream os = new FileOutputStream(file);
//            BufferedOutputStream bos = new BufferedOutputStream(os);
            byte[] data = new byte[1024];
            try (os) {
                for (int i = 0; i < 100 * 1024; i++) {
                    os.write(data);
                }
                os.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void bufferedOutputStream() {
        String file = "C:/Temp/filter41.data";
        try {
            OutputStream os = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            byte[] data = new byte[1024];
            try (bos; os) {
                for (int i = 0; i < 100 * 1024; i++) {
                    bos.write(data);
                }
                bos.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
