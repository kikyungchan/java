package 자습.p20250513;

public interface Animal {
    void sound();

    void care();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    public void care() {
        sound();
        run();
    }

    public void run() {
        System.out.println("개가 달립니다");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    public void care() {
        sound();
        climb();
    }

    public void climb() {
        System.out.println("고양이가 나무를 탑니다");
    }
}

class Bird implements Animal {
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    public void care() {
        sound();
        fly();
    }

    public void fly() {
        System.out.println("새가 날아갑니다.");
    }
}

class Fish implements Animal {
    @Override
    public void sound() {
        System.out.println("뻐끔");
    }

    public void care() {
        sound();
        swim();
    }

    public void swim() {
        System.out.println("물고기가 헤엄칩니다");
    }
}

class Caretaker {
    void takeCare(Animal a) {
        a.care();
    }
}


