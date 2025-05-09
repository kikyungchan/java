package ch06.exercise.p20;

public class Account {
    private String name;//이름
    private String ano;//예끔주?
    private int balance;//돈

    public Account(String name, String ano, int balance) {
        this.name = name;
        this.ano = ano;
        this.balance = balance;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAno() {
        return ano;
    }

    public int getBalance() {
        return balance;
    }

    public void showInfo() {
        System.out.println("계좌번호: " + ano + ", 계좌주: " + name + ", 잔액: " + balance);
    }
}
