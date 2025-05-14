package ch16.exercise.p05;

public class Example {
    public static void main(String[] args) {
        Button Ok = new Button();
        Ok.setClickListener(() -> System.out.println("Ok버튼을 클릭했습니다"));
        Ok.click();

        Button Cancel = new Button();
        Cancel.setClickListener(() -> System.out.println("Cancel 버튼을 클릭"));
        Cancel.click();

    }
}
