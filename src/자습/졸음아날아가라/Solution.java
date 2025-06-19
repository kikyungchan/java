package 자습.졸음아날아가라;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println("reverse = " + reverse);
    }

}
