package ch09.sec07.exam01;

public class Car {
    private Tire tire1 = new Tire();

    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("익명자식 굴러가유");
        }
    };

    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    public void run2() {
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("익명자식2 굴러가유");
            }
        };
        tire.roll();
    }

    public void run3(Tire tire) {
        tire.roll();
    }
}
