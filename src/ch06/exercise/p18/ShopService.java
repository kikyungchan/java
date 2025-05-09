package ch06.exercise.p18;

public class ShopService {
    private static ShopService instance;

    public static ShopService getInstance() {
        return instance;
    }

    public static void setInstance(ShopService instance) {
        ShopService.instance = instance;
    }
}
