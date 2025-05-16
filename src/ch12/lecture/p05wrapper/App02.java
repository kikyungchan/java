package ch12.lecture.p05wrapper;

public class App02 {
    public static void main(String[] args) {

        //Wrapper 클래스의 참조변수는
        //null을 저장할 수 있고

        int a = 3;
        int b = 0;

        Integer c = 3;
        Integer d = 0;

        Integer e = null; // 참조타입니까 null 가능

        int f = 30000;
        int g = 30000;
        System.out.println(f == g);


        //참조타입의 값을 비교하고 싶은 경우 제발 .equals 로 해라 \
        // == 로 하면 참조값비교를해서 그때그때 다르게 나옴.
        Integer h = 30000;
        Integer i = 30000;
        System.out.println(h == i);
        System.out.println(h.equals(i));
        System.out.println(System.identityHashCode(h));
        System.out.println(System.identityHashCode(i));

        Integer j = 3;
        Integer k = 3;
        System.out.println(j == k);
        System.out.println(j.equals(k));

    }
}
