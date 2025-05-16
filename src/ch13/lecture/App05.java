package ch13.lecture;

public class App05 {
    public static void main(String[] args) {

    }
}

//타입 파라미터는 여러개 작성 정의가능
class Container<T, U> {
    private T item1;
    private U imte2;

    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public U getImte2() {
        return imte2;
    }

    public void setImte2(U imte2) {
        this.imte2 = imte2;
    }
}
