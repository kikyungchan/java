package ch12.exercise.p17;

public class IntegerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;


        //참조타입끼리의 비교는 .equals을 사용해야 정확한 비교가 가능
        // == 을 사용하게되면 참조값비교를해서 결과를 출력함. 고로 그때그때 다르게 나옴
//        System.out.println(obj1 == obj2);
//        System.out.println(obj3 == obj4);

        System.out.println(obj1.equals(obj2));
        System.out.println(obj3.equals(obj4));
        System.out.println();


    }
}
