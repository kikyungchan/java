package ch12.sec03.exam03;

public class SmartPhone {
    private String company;
    private String os;

    @Override
    public String toString() {
        return "Smartphone{" +
                "company='" + company + '\'' +
                ", os='" + os + '\'' +
                '}';
    }

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;


    }
}
