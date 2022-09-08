public class Main {
    public static void main(String[] args) {
        Employee jack = new Employee("Jack", 30000, "3");
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Афанасьев Григорий Константинович", 30500, "1");
        employee[1] = new Employee("Серов Дмитрий Анатольевич", 53200, "3");
        employee[2] = new Employee("Вербен Анастасия Семеновна", 42500, "5");
        employee[3] = new Employee("Плашхина Людмила Анатольевна", 33300, "1");
        employee[4] = new Employee("Круглов Данил Даниилович", 28500, "1");
        employee[5] = new Employee("Роготнева Ольга Владимировна", 38000, "5");
        employee[6] = new Employee("Огрмагова Виолетта Киприановна", 69000, "3");
        employee[7] = new Employee("Казлюк Дмитрий Христофорович", 45000, "2");
        employee[8] = new Employee("Лютец Инна Геннадьевна", 75000, "4");
        employee[9] = new Employee("Фадеев Михаил Артемович", 43675, "2");

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);

        }
    }
}