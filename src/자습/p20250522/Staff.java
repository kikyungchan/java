package 자습.p20250522;

public class Staff {
    private String name;
    private int salary;
    private String department;

    public Staff(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name + ": " + salary + " (" + department + ")";
    }
}

