package coursework1;

public class Employee {
    private static int counter = 0;
    private final String name;
    private final String surname;
    private final String patronymic;
    private final Integer id;
    private int salary;
    private int department;

    public Employee(String name, String surname, String patronymic, int department, int salary) {

        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.salary = salary;
        this.id = counter++;
        this.department = department;
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public Integer getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник " +
                "id =" + id +
                ". ИМЯ: " + name + " ФАМИЛИЯ: " + surname +
                " ОТЧЕСТВО: " + patronymic +
                ", зарплата = " + salary +
                ". Отдел: " + department;
    }
}


