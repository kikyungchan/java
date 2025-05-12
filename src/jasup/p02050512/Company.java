package jasup.p02050512;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Developer("철수");
        Employee emp2 = new Designer("영희");

        emp1.work();//철수
        emp2.work();//영희

    }
}

abstract class Employee {

    String name;

    public Employee(String name) {
        this.name = name;
    }

    abstract void work();
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println(name + "이(가) 코딩합니다");
    }

    public Developer(String name) {
        super(name);
    }
}

class Designer extends Employee {
    @Override
    void work() {
        System.out.println(name + "이(가) 디자인합니다");
    }

    public Designer(String name) {
        super(name);
    }
}
