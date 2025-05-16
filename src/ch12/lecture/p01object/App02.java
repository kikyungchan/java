package ch12.lecture.p01object;

public class App02 {
    public static void main(String[] args) {
        Book02 b1 = new Book02();
        Book02 b2 = new Book02();

        b1.setTitle("ㅇ;거시 자바다");
        b2.setTitle("프로 깃");
        //참조값이 같은가?
        System.out.println(b1 == b2);

        //equals 메쏘드 :: 내용이 같은가
        System.out.println(b1.equals(b2));

    }
}

class Book02 {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
