package ch03.sec07;

public class Logical10peratorExample {
    public static void main(String[] args) {
        int charCode = '0';
//        int charCode = 'a';
//        int charCode = '5';

        // 'A'                               'Z' 로 써도됨
        if ((65 <= charCode) && (charCode <= 90)) {
            System.out.println("대문자군요");
        }
        // 'a'                               'z'
        if ((97 <= charCode) && (charCode <= 122)) {
            System.out.println("소문자군요.");
        }
        if ((48 <= charCode) && (charCode <= 57)) {
            System.out.println("숫자이군요.");
        }

        //--------------------------------------

        int value = 6;
        //int value =7;

        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2또는 3의 배수이군요.");
        }

        boolean result = (value % 2 == 0) || (value % 3 == 0);
        if (!result) {
            System.out.println("2또는 3의 배수가 아니군요.");
        }
    }
}
