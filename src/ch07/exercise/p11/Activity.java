package ch07.exercise.p11;

public class Activity {
    public static void main(String[] args) {
        MainActivity a = new MainActivity();
        a.onCreate();
    }

    public void onCreate() {
        System.out.println("기본적인 실행 내용");
    }
}
