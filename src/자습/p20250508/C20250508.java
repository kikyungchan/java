package 자습.p20250508;

public class C20250508 {
    public static void main(String[] args) {
        student s1 = new student("홍길동", 16, 2);
        student s2 = new student("이영희", 15, 1);

        s1.displayInfo();
        s2.displayInfo();

        s1.updateAge(17);
        s2.updateAge(18);

        System.out.println("\n업데이트된 학생 정보:");
        s1.displayInfo();
        s2.displayInfo();
    }
}

class student {
    String name;
    int age;
    int grade;

    public student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void updateAge(int newage) {
        this.age = newage;
    }

    void displayInfo() {
        System.out.println("이름 = " + name);
        System.out.println("나이 = " + age);
        System.out.println("학년 = " + grade);
    }
}

//class BookClass01 {
//    String title;
//    String author;
//    int price;
//
//    public BookClass01(String title) {
//        this(title, "작자미상", 0);
//    }
//
//    public BookClass01(String title, String author) {
//        this(title, author, 0);
//    }
//
//    public BookClass01(String title, String author, int price) {
//        this.title = title;
//        this.author = author;
//        this.price = price;
//    }
//
//}
