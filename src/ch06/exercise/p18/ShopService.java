package ch06.exercise.p18;

public class ShopService {
    private ShopService() {
    }//외부에서 객체생성못하게 막음

    
    private static ShopService object;//유일한 인스턴스를 저장할 정적변수 생성

    public static ShopService getInstance() {
        if (object == null) { //첫 호출만 객체를 생성하고 처음에null이니까
            object = new ShopService();
        }
        return object;//그 이후론 같은 객체를 반환
    }
}
