package 자습.p20250513;

public interface Vehicle {
    void move();

    void toksu();
}

class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("도로를 달린다");
    }

    @Override
    public void toksu() {
        move();
        park();
    }

    public void park() {
        System.out.println("주차한다");
    }
}

class Boat implements Vehicle {
    @Override
    public void move() {
        System.out.println("물 위를 떠다닌다");
    }

    @Override
    public void toksu() {
        move();
        anchor();
    }

    public void anchor() {
        System.out.println("배가 정박한다");
    }
}

class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("하늘을 납니다");
    }

    @Override
    public void toksu() {
        move();
        takeOff();
    }

    public void takeOff() {
        System.out.println("이륙");
    }
}

class Bicycle implements Vehicle {

    @Override
    public void move() {
        System.out.println("자전거 도로를 달림");
    }

    @Override
    public void toksu() {
        move();
    }
}

class Controller {
    public void control(Vehicle v) {
        v.toksu();
    }
}
