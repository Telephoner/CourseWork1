public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Афанасьев", "Григорий", "Константинович", 30500, "1");
        employees[1] = new Employee("Серов", "Дмитрий", "Анатольевич", 53200, "3");
        employees[2] = new Employee("Вербен", "Анастасия", "Семеновна", 42500, "5");
        employees[3] = new Employee("Плашхина", "Людмила", "Анатольевна", 33300, "1");
        employees[4] = new Employee("Круглов", "Данил", "Даниилович", 28500, "1");
        employees[5] = new Employee("Роготнева", "Ольга", "Владимировна", 38000, "5");
        employees[6] = new Employee("Огрмагова", "Виолетта", "Киприяновна", 69000, "3");
        employees[7] = new Employee("Казлюк", "Дмитрий", "Христофорович", 45000, "2");
        employees[8] = new Employee("Лютец", "Инна", "Геннадьевна", 75000, "4");
        employees[9] = new Employee("Фадеев", "Михаил", "Артемович", 43675, "2");
        printEmployees();
        System.out.println(calculateTotalSalary());
        System.out.println(getMinimumSalaryOfAllEmployees());
        System.out.println(getMaximumSalaryOfAllEmployees());
        System.out.println(getAverageOfAllSalaries());
        printFullNames();



    }

    private static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee getMinimumSalaryOfAllEmployees() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }

        }
        return result;
    }

    public static Employee getMaximumSalaryOfAllEmployees() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static double getAverageOfAllSalaries() {
        double avgSalary = 0;
        for (Employee employee : employees) {
            avgSalary = calculateTotalSalary() / employees.length;
        }
        return avgSalary;
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeFullName());

        }
    }


}