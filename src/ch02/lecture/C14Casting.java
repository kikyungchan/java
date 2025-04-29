package ch02.lecture;

public class C14Casting {
    public static void main(String[] args) {
        //타입 변환

        byte a = 3; //1byte
        short b = 100;//2byte
        int c = 200;//4byte
        long d = 300L;//8byte

        //작은 타입의 변수값을 큰 타입에 옮겨 담는 것은 항상 가능
        b = a;//ok
        c = a;//ok
        d = a;//ok


        c = b;
        d = b;


        d = c;

        //정수형(byte, short, int, long)의 값을
        //실수형(float, double)에 옮겨 담는 것 가능(문제없음)
        byte e = 3;
        short f = 4;
        int g = 9;
        long h = 10L;

        float i;
        double j;
        i = e;// ok 여러커서 alt shift 마우스클릭
        i = f;// ok 여러커서 alt shift 마우스클릭
        i = g;// ok 여러커서 alt shift 마우스클릭
        i = h;// ok 여러커서 alt shift 마우스클릭

        j = e;// ok 여러커서 alt shift 마우스클릭
        j = f;// ok 여러커서 alt shift 마우스클릭
        j = g;// ok 여러커서 alt shift 마우스클릭
        j = h;// ok 여러커서 alt shift 마우스클릭

        //작은타입에서 큰타입으로 옮기기 가능(문제없음)
        float k = 3.14F;
        double l = 3.14;

        l = k; // ok

        //char타입은 int와 long에 옮기기 가능
        char m = '가';
        int n = m;
        long o = m;

//        short p = m; //x

    }
}
