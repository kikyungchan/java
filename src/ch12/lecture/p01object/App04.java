package ch12.lecture.p01object;

public class App04 {
    public static void main(String[] args) {
        String a = new String("java");
        String b = new String("java");
        //참조값이 같냐? ㄴㄴ
        System.out.println(a == b);
        //내용물이 같냐? ㅇㅇ
        System.out.println(a.equals(b));
    }
}
