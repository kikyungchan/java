package ch02.lecture;

public class C18Operator {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = a + b;//int
        System.out.println("c = " + c);

        //다른 타입 끼리 산술연산할때
        //큰타입이 연산 결과임
        int d = 10; //int는 4바이트
        long e = 20;// long은 8바이트
        long f = d + e; // 그러니까 int에 못담음

        int h = 3;
        double i = 3.14;
        double j = h + i; //(정수랑실수랑더하면 당연히 실수)

        //바이트 숏 인트 끼리의 연산결과는 무조건 인트임
        byte k = 5;
        int l = 8;
        int m = k + l;

        byte n = 7;
        byte o = 9;
//        byte p = n + o;
        int p = n + o;

        int r = 5;
        int s = 3;
        int t = r / s;
        System.out.println("t = " + t);
        double u = r / s;
        System.out.println("u = " + u);

        double v = r / (double) s;
        double w = (double) r / s;
        System.out.println("v = " + v);
        System.out.println("w = " + w);
    }
}
