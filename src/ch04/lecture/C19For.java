package ch04.lecture;

public class C19For {
    public static void main(String[] args) {
        // 2x1
        // 2x2
        // 2x3
        // ...
        // 2x9

        // 3x1
        // ..
        // 3x9

        // ..

        // 9x9
        String a = "string";
        String b = "";
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                b += c;
            }
        }
        System.out.println("b = " + b);
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < my_string.length(); j++) {
                char c = my_string.charAt(i);
                answer += c;
            }
        }

        //a 를 k번 반복 a*k?

//        for (int i = 2; i < 10; i++) {
//            System.out.println(i + "단##############################");
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " X " + j + " = " + (i * j));
//            }
    }
}
//}
