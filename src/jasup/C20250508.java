package jasup;

public class C20250508 {
    public static void main(String[] args) {

    }
}

class BookClass01 {
    String title;
    String author;
    int price;

    public BookClass01(String title) {
        this(title, "작자미상", 0);
    }

    public BookClass01(String title, String author) {
        this(title, author, 0);
    }

    public BookClass01(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
