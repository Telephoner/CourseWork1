import java.util.Objects;
import java.util.Random;

public class Employee {
    private String employeeName;
    private int salary;
    private String department;

    public Employee(String employeeName, int salary, String department) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.department = department;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public int getSalary() {
        return this.salary;

    }

    public String getDepartment() {
        return department;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                employeeName +
                ", заработная плата: " + salary +
                ", отдел: " + department + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeName, employee.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName);
    }
}
