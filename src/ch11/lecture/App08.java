package ch11.lecture;

public class App08 {
    public static void main(String[] args) {
        //try, catch

        try {
            int[] arr = {5, 0};
            int c = arr[0] / arr[2];

            System.out.println("c = " + c);
            System.out.println("다음 코드들");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("0으로 나눌수 없음");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("인덱스 초과");
        } finally {
            // 파이널리
            // 익셉션 발생 여부 관계 없이.심지어 메소드 종료되어도(리턴되어도)
            // 항상 실행 되는 코드
            System.out.println("항상 진행되는 코드블럭.");

        }
        System.out.println("이어지는 나머지 코드");
    }
}
