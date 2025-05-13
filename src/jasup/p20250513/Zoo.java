package jasup.p20250513;

public class Zoo {
    public static void main(String[] args) {
        Caretaker c = new Caretaker();

        Animal[] animals = {
                new Cat(), new Bird(), new Dog(), new Fish()
        };

        for (Animal a : animals) {
            c.takeCare(a);
            System.out.println("------");
        }
    }
}
