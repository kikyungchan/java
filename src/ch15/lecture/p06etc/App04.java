package ch15.lecture.p06etc;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class App04 {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();
        set1.add("java");
        set1.add("css");
        set1.add("spring");
        System.out.println("set1 = " + set1);

        Set<Book04> set2 = new HashSet<>();
        set2.add(new Book04("java", 3000));
        set2.add(new Book04("git", 4000));
        set2.add(new Book04("spring", 2000));
        set2.add(new Book04("spring", 2000));

        set2.forEach(System.out::println);

        Set<Book04> set3 = new TreeSet<>();
        set3.add(new Book04("java", 3000));
        set3.add(new Book04("git", 4000));
        set3.add(new Book04("spring", 2000));
        set3.add(new Book04("spring", 1000));
        System.out.println();
        set3.forEach(System.out::println);
    }
}

//내추럴 오더링은 컴페어러블 구현
class Book04 implements Comparable<Book04> {
    private String title;
    private Integer price;

    // 생성자 ,게터, 세터, 투스트링, 해쉬코드, 이퀄즈
    public Book04(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book04{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book04 book04 = (Book04) o;
        return Objects.equals(title, book04.title) && Objects.equals(price, book04.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public int compareTo(Book04 o) {
        //가격 순 정렬
//        return this.price - o.price;
        //제목 순 정렬
//        return this.title.compareTo(o.title);
        //같은 제목이면 가격으로 비교하겠다.
        int t = this.title.compareTo(o.title);
        if (t == 0) {
            return this.price - o.price;
        } else {
            return t;
        }
    }

}
