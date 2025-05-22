package ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열의 인덱스 초과");
            } catch (NullPointerException | NumberFormatException exception) {
                System.out.println("데이터 문제");
            }
        }
        System.out.println("나머지 진행 코드");
    }
}
