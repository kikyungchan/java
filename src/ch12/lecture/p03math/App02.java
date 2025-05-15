package ch12.lecture.p03math;

import java.util.Random;

public class App02 {
    public static void main(String[] args) {
        //Math.random():0.0d <= x < 1.0d임의의 수를 뽑기
        System.out.println(Math.random());
        double dice = Math.floor(Math.random() * 6) + 1;
        System.out.println("dice = " + dice);

        //Random : 임의의 수 뽑아 주는 객체
        //nextdouble = 0~1사이의 수 뽑기
        Random r = new Random();
        double v = r.nextDouble();
        System.out.println("v = " + v);

        //nextInt(): 임의의 정수 -21억~21억
        int i = r.nextInt();
        System.out.println("i = " + i);

//nextInt(bound):0~bound-1사이의 리턴
        int r1 = r.nextInt(6);//0~6
        int r2 = r.nextInt(6) + 1;//0~6
        System.out.println("r2 = " + r2);
    }


}
