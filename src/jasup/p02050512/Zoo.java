package jasup.p02050512;


public class Zoo {
    public static void act(Animal animal) {
        animal.sound();

        if (animal instanceof Dog d) {
            d.fetch();
        } else if (animal instanceof Cat c) {
            c.scratch();
        }
    }


    public static void main(String[] args) {
        act(new Dog());
        act(new Cat());
    }
}

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("멍멍!");
    }

    public void fetch() {
        System.out.println("공을 물어옵니다");

    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("야옹~");

    }

    public void scratch() {
        System.out.println("할퀴기 공격!");

    }
}

