package ch11.lecture;

public class App05 {
    public static void main(String[] args) {
        try {
            int[] arr = {5, 0};
            //인덱스아웃오브바운즈익셊ㄴ션
            //아리스매틱익셉션
            int r = arr[1] / arr[0];
            System.out.println("다음 코드.");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("배열의 인덱스 참조가 잘못");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("0으로 나눌때");
        }
        System.out.println("나머지 진행 코드");
    }
}
