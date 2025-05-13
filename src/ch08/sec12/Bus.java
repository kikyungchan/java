package ch08.sec12;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가유");
    }

    public void checkFare() {
        System.out.println("요금 체크할게유");
    }
}
