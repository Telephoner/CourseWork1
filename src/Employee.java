import java.util.Objects;
import java.util.Random;

public class Employee {
    private static int counter = 0;
    static Integer id;

    private String name;
    private String middleName;
    private String lastName;
    private int salary;
    private String department;

    public Employee(String lastName, String name, String middleName, int salary, String department) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
        this.id = counter++;
    }

    public String getEmployeeFullName() {
        return this.name + " " + this.middleName + " " + this.lastName;
    }

    public int getSalary() {
        return this.salary;

    }

    public String getDepartment() {
        return department;
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
                getEmployeeFullName() +
                ", заработная плата: " + salary +
                ", отдел: " + department + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.getEmployeeFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
