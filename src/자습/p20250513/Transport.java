package 자습.p20250513;

public class Transport {
    public static void main(String[] args) {
        Controller c = new Controller();

        Vehicle[] v = {
                new Car(), new Airplane(), new Bicycle(), new Boat()
        };

        for (int i = 0; i < v.length; i++) {
            Vehicle a = v[i];
            c.control(a);
        }
    }
}
