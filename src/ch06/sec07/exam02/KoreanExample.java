package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        korean k1 = new korean("박자바", "011225-1234567");

        System.out.println("k1.nation = " + k1.nation);
        System.out.println("k1.name = " + k1.name);
        System.out.println("k1.ssn = " + k1.ssn);
        System.out.println();

        korean k2 = new korean("김자바", "930525-0654321");

        System.out.println("k2.nation = " + k2.nation);
        System.out.println("k2.name = " + k2.name);
        System.out.println("k2.ssn = " + k2.ssn);
        
    }
}
