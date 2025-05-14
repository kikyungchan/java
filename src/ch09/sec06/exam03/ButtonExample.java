package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("ok버튼 클릭할게");
            }
        }

        btnOk.setClickListener(new OkListener());

        btnOk.click();


        Button btnCancel = new Button();

        class CancleListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancle버튼 클릭할게");
            }
        }

        btnCancel.setClickListener((new CancleListener()));

        btnCancel.click();
        
    }
}
