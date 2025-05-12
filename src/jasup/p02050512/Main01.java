package jasup.p02050512;

public class Main01 {
    public static void main(String[] args) {
        Car car = new SportsCar();
        car.run();
//        car.turboBoost;
    }
}


class Car {
    void run() {
        System.out.println("차가 달립니다");
    }
}

class SportsCar extends Car {
    @Override
    void run() {
        System.out.println("수포츠카가 빠르게 달립니다");
    }

    void turboBoost() {
        System.out.println("터보 부스트~");
    }
}
