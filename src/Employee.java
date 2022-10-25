
public class Employee {

    private final String name;
    private int department;
    private int salary;
    private static int counter = 1;
    private final int id;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "{id=" + this.id +
                "} " + this.name +
                " Сотрудник отдела №" + this.department +
                " Размер З/П - "  + this.salary + " рублей.";
    }
}

