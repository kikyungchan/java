package 자습.p20250509;

import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[3];
        int bookss1 = 0;
        boolean run = true;
        while (run) {
            System.out.println("1. 도서 입력 | 2. 전체 출력 | 3. 종료");
            System.out.print("선택> ");
            String menu = scanner.nextLine();
            if (menu.equals("1")) {

                System.out.println("도서 1권 정보 입력");
                System.out.print("제목: ");
                String title = scanner.nextLine();
                System.out.print("저자: ");
                String author = scanner.nextLine();
                System.out.print("가격: ");
                int price = Integer.parseInt(scanner.nextLine());
                books[bookss1] = new Book(title, author, price);

            } else if (menu.equals("2")) {

                System.out.println("도서 2권 정보 입력");
                System.out.print("제목: ");
                String title = scanner.nextLine();
                System.out.print("저자: ");
                String author = scanner.nextLine();
                System.out.print("가격: ");
                int price = Integer.parseInt(scanner.nextLine());
                books[bookss1] = new Book(title, author, price);

            } else if (menu.equals("3")) {

                System.out.println("도서 3권 정보 입력");
                System.out.print("제목: ");
                String title = scanner.nextLine();
                System.out.print("저자: ");
                String author = scanner.nextLine();
                System.out.print("가격: ");
                int price = Integer.parseInt(scanner.nextLine());
                books[bookss1] = new Book(title, author, price);

            } else if (menu.equals("4")) {
                run = false;
                System.out.println("프로그램을 종료합니다");
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}


class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("가격은 0 이상이어야 합니다.");
        } else {
            this.price = price;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
