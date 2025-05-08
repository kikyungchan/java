package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        //Car객체생성
        Car c = new Car();
        //리턴 값이 없는 setGas()ㅁ[ㅔ소드 호출
        c.setGas(5);

        //isLeftGas()메소드를 호출해서 받은 리턴값이 true일 경우 if블록 실행
        if (c.isLeftGas()) {
            System.out.println("출발합니다");

            //리턴값이 없는 run() 메소드 호출
            c.run();
        }

        System.out.println("gas를 주입하세요");


    }
}
