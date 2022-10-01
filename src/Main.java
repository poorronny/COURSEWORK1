import coursework1.Employee;

import java.util.Arrays;

public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee worker1 = new Employee("Василий", "Воронин", "Владимирович", 1, 72300);
        Employee worker2 = new Employee("Никита", "Дмитриенко", "Дмитриевич", 4, 89630);
        Employee worker3 = new Employee("Вероника", "Дорофеева", "Сергеевна", 3, 74900);
        Employee worker4 = new Employee("Софья", "Романова", "Сергеевна", 2, 87200);
        Employee worker5 = new Employee("Ольга", "Александрова", "Николаевна", 3, 68900);
        Employee worker6 = new Employee("Мария", "Артамонова", "Николаевна", 5, 56400);
        Employee worker7 = new Employee("Иван", "Вязовой", "Олегович", 1, 74500);
        Employee worker8 = new Employee("Анастасия", "Карасёва", "Сергеевна", 3, 42300);
        Employee worker9 = new Employee("Руслан", "Мирошин", "Евгеньевич", 4, 36958);
        Employee worker10 = new Employee("Ирина", "Романова", "Максимовна", 5, 58962);

        employees[0] = worker1;
        employees[1] = worker2;
        employees[2] = worker3;
        employees[3] = worker4;
        employees[4] = worker5;
        employees[5] = worker6;
        employees[6] = worker7;
        employees[7] = worker8;
        employees[8] = worker9;
        employees[9] = worker10;

        Employee[] worker = Arrays.copyOf(employees, 11);

        Arrays.stream(employees).forEach(System.out::println);
        System.out.println(employees.length);
    }

    public static void printEmployers() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static Employee findMinSalary() {
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

    public static Employee findMaxSalary() {
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

    public static int calculateAverageSalary() {
        return calculateTotalSalary() / employees.length;
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getSurname() + employee.getName() + employee.getPatronymic());
        }
    }
}


