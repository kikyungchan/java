package ch16.sec02.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(() -> {
            System.out.println("ok버튼을 클릭했설");
        });

        btnOk.click();
        Button btnCancel = new Button();

        btnCancel.setClickListener(() -> {
            System.out.println("Cancle버튼을 클릭했설");
        });

        btnCancel.click();
    }
}
