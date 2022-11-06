public class Main {
    private static Employee[] employees = new Employee[10];


    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println("employee = " + employee);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
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
    public static Employee findEmployeeWithMaxSalary() {
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

    public static float calculateAverageSalary() {
        return calculateTotalSalary() / (float) employees.length;
    }

    public static void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    public static void main(String[] args) {
        employees = new Employee[]{
                new Employee("Иванов Иван Иванович ", 100000, 1),
                //null,
                new Employee("Степанов Степан ", 110000, 2),
                new Employee("Петров Пётр ", 105000, 1),
                new Employee("Сидоров Константин", 125000, 2),
                new Employee("Беспалов Александр ", 1120000, 3),
                new Employee(" Михеева Ярослава ", 150000, 5),
                new Employee("Новикова Анастасия ", 115000, 4),
                new Employee("Филиппова Арина ", 155000, 2),
                new Employee("Васильев Артём   ", 130000, 3)
        };
        //employees[0] = new Employee("Иванов Иван ", 100000, 1);
        printFullName();
        printEmployees();
        printEmployees();
        calculateAverageSalary();
        System.out.println("Средняя зарплата: " + calculateAverageSalary());
        System.out.println("=============");
    }
}
