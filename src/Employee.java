import java.util.Objects;

public class Employee {
    private final String name;
    private static int counter = 0;
    public int id;
    private int salary;
    private int department;

    public Employee(String name, int salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = counter ++;
    }

    public int getId() {return id;}

    public String getName() {return this.name;}

    public int getSalary() {return this.salary;}

    public void setSalary(int salary) {this.salary = salary;}

    public void setDepartment(int department) {this.department = department;}

    public int getDepartment() {return this.department;}

    @Override
    public String toString() {
        return "Employee{" +
                "Сщтрудник: " + name + '\'' +
                ", id=" + id +
                ", Зарплата: " + salary +
                ", Отдел: " + department +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && department == employee.department && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, salary, department);
    }
}



